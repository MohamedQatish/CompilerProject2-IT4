package VISITOR;
import AST.*;
import SYMBOL_TABLE.*;
import ANTLR.AngularParser;
import ANTLR.AngularParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class BaseVisitor extends AngularParserBaseVisitor {
    private SymbolTable symbolTable = new SymbolTable();
    private String currentScope = "global"; // Track current scope for symbol resolution
    
    /**
     * Helper method to get source location from a context
     */
    private String getLocation(ParserRuleContext ctx) {
        if (ctx == null || ctx.start == null) {
            return "unknown location";
        }
        Token start = ctx.start;
        return "line " + start.getLine() + ":" + start.getCharPositionInLine();
    }
    
    /**
     * Helper method to add a semantic error
     */
    private void addError(String category, String errorType, String message, ParserRuleContext ctx) {
        String location = getLocation(ctx);
        SemanticError error = new SemanticError(errorType, message, location, currentScope);
        symbolTable.addError(category, error);
    }

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx){
        Program program = new Program();
        
        // Initialize error tables for different categories
        symbolTable.addErrorTable("variableErrors");
        symbolTable.addErrorTable("functionErrors");
        symbolTable.addErrorTable("scopeErrors");
        symbolTable.addErrorTable("importErrors");
        symbolTable.addErrorTable("componentErrors");
        symbolTable.addErrorTable("templateErrors");
        
        if(ctx.importStatement()!=null)
        {
            program.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        
        for (int i = 0; i < ctx.statment().size(); i++) {
            if (ctx.statment(i)!=null)
            {
                program.getSourceElement().add(visitStatment(ctx.statment(i)));
            }
        }
        
        // Print both symbols and errors
        this.symbolTable.printyy();

        return program;
    }

    @Override
    public ImportStatmente visitImportStatement(AngularParser.ImportStatementContext ctx)
    { 
        ImportStatmente importStatement = new ImportStatmente();
        for (int i = 0; i < ctx.importFromBlock().size(); i++) {
            if (ctx.importFromBlock(i)!=null)
            {
                importStatement.getImportFromBlocks().add(visitImportFromBlock(ctx.importFromBlock(i)));
            }
        }
        return importStatement;
    }

    @Override
    public ImportFromBlock visitImportFromBlock(AngularParser.ImportFromBlockContext ctx)
    {
        ImportFromBlock importFromBlock = new ImportFromBlock();

        if (ctx.IDENTIFIER()!= null){
            String identifier = ctx.IDENTIFIER().getText();
            importFromBlock.setIdentifier(identifier);
            
            // Add to symbol table with location information
            Row row = new Row("ImportIdentifier", identifier, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
        }
        
        if (ctx.moduleItems()!=null)
        {
            importFromBlock.setModuleItems(visitModuleItems(ctx.moduleItems()));
        }

        if (ctx.STRINGLITERAL()!= null){
            String importFrom = ctx.STRINGLITERAL().getText();
            importFromBlock.setImportFrom(importFrom);
            
            // Check if the import path is valid (simple check for demonstration)
            if (importFrom.equals("\"\"") || importFrom.length() <= 2) {
                addError("importErrors", "invalid_import_path", 
                        "Import path is empty or invalid: " + importFrom, ctx);
            }
        } else {
            // Missing import path
            addError("importErrors", "missing_import_path", 
                    "Import statement is missing the source path", ctx);
        }

        return importFromBlock;
    }

    @Override
    public ModuleItems visitModuleItems(AngularParser.ModuleItemsContext ctx) {
        ModuleItems moduleItems = new ModuleItems();

        if (ctx.COMPONENT()!= null)
            moduleItems.setComponent(ctx.COMPONENT().getText());

        if (ctx.IDENTIFIER(0)!= null) {
            String identifier1 = ctx.IDENTIFIER(0).getText();
            moduleItems.setIdentifier1(identifier1);
            
            // Add to symbol table
            Row row = new Row("ModuleItem", identifier1, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
        }
        
        if (ctx.IDENTIFIER(1)!= null) {
            String identifier2 = ctx.IDENTIFIER(1).getText();
            moduleItems.setIdentifier2(identifier2);
            
            // Add to symbol table
            Row row = new Row("ModuleItem", identifier2, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
        }
        
        return moduleItems;
    }

    @Override
    public Statment visitStatment(AngularParser.StatmentContext ctx) {
        Statment statement = new Statment();
        
        if(ctx.functionDeclaration()!=null)
        {
            statement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        if(ctx.variableStatement()!=null)
        {
            statement.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        if(ctx.expressionStatement()!=null)
        {
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if(ctx.componentDeclaration()!=null)
        {
            statement.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        }
        if(ctx.classDeclaration()!=null)
        {
            statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        
        return statement;
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        
        if(ctx.componentAttributes()!=null){
            componentDeclaration.setComponentAttributes(visitComponentAttributes(ctx.componentAttributes()));
        } else {
            // Component declaration without attributes is a semantic error
            addError("componentErrors", "missing_component_attributes", 
                    "Component declaration is missing required attributes", ctx);
        }
        
        return componentDeclaration;
    }

    @Override
    public Template visitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx) {
        Template template = new Template();
        
        if(ctx.TEMPLATE()!=null)
        {
            template.setTemplate(ctx.TEMPLATE().getText());
        }
        
        if(ctx.COLON()!=null){
            template.setColon(ctx.COLON().getText());
        }
        
        if (ctx.htmlElements() != null) {
            template.setHtmlElementsNode(visitHtmlElements(ctx.htmlElements()));
        } else {
            // Template without HTML elements is a semantic error
            addError("templateErrors", "empty_template", 
                    "Template declaration is empty", ctx);
        }
        
        return template;
    }

    @Override
    public ComponentAttributes visitComponentAttributes(AngularParser.ComponentAttributesContext ctx) {
        ComponentAttributes componentAttributes = new ComponentAttributes();
        
        boolean hasSelector = false;
        boolean hasTemplate = false;
        
        for (int i = 0; i < ctx.componentAttribute().size(); i++) {
            if (ctx.componentAttribute(i) != null) {
                ComponentAttribute attr = visitComponentAttribute(ctx.componentAttribute(i));
                componentAttributes.getComponentAttribute().add(attr);
                
                // Check for required attributes
                if (attr.getSelector() != null) hasSelector = true;
                if (attr.getTemplate() != null) hasTemplate = true;
            }
        }
        
        // Semantic check: Component must have selector and template
        if (!hasSelector) {
            addError("componentErrors", "missing_selector", 
                    "Component is missing required selector attribute", ctx);
        }
        
        if (!hasTemplate) {
            addError("componentErrors", "missing_template", 
                    "Component is missing required template attribute", ctx);
        }
        
        return componentAttributes;
    }

    @Override
    public ComponentAttribute visitComponentAttribute(AngularParser.ComponentAttributeContext ctx) {
        ComponentAttribute componentAttribute = new ComponentAttribute();
        
        if(ctx.templateDeclaration()!=null){
            componentAttribute.setTemplate(visitTemplateDeclaration(ctx.templateDeclaration()));
        }
        
        if(ctx.selectorDeclaration()!=null){
            componentAttribute.setSelector(visitSelectorDeclaration(ctx.selectorDeclaration()));
        }
        
        if(ctx.standaloneDeclaration()!=null){
            componentAttribute.setStandalone(visitStandaloneDeclaration(ctx.standaloneDeclaration()));
        }
        
        if(ctx.importsDeclaration()!=null){
            componentAttribute.setImports(visitImportsDeclaration(ctx.importsDeclaration()));
        }
        
        if(ctx.stylesDeclaration()!=null){
            componentAttribute.setStyles(visitStylesDeclaration(ctx.stylesDeclaration()));
        }
        
        return componentAttribute;
    }

    @Override
    public HtmlElementsNode visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
        HtmlElementsNode htmlElementsNode = new HtmlElementsNode();
        
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                htmlElementsNode.getHtmlElements().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        
        // Semantic check: HTML elements should not be empty
        if (htmlElementsNode.getHtmlElements().isEmpty()) {
            addError("templateErrors", "empty_html_elements", 
                    "HTML elements section is empty", ctx);
        }
        
        return htmlElementsNode;
    }

    @Override
    public HtmlElementNode visitHtmlElement(AngularParser.HtmlElementContext ctx)
    {
        HtmlElementNode htmlElementNode = new HtmlElementNode();
        
        String openTag = null;
        String closeTag = null;
        
        if(ctx.IDENTIFIER(0)!= null)
        {
            openTag = ctx.IDENTIFIER(0).getText();
            htmlElementNode.setTagName(openTag);
            
            // Add to symbol table
            Row row = new Row("HtmlTag", openTag, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
        }
        
        for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
            if (ctx.htmlAttribute(i) != null) {
                htmlElementNode.getAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }
        }
        
        if (ctx.htmlContent()!=null)
        {
            htmlElementNode.setContent(visitHtmlContent(ctx.htmlContent()));
        }
        
        if(ctx.IDENTIFIER(1)!= null)
        {
            closeTag = ctx.IDENTIFIER(1).getText();
            htmlElementNode.setTagNameClose(closeTag);
        }
        
        // Semantic check: Opening and closing tags must match
        if (openTag != null && closeTag != null && !openTag.equals(closeTag)) {
            addError("templateErrors", "mismatched_tags", 
                    "Opening tag <" + openTag + "> does not match closing tag </" + closeTag + ">", ctx);
        }

        return htmlElementNode;
    }
    
    @Override
    public HtmlAttributeNode visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();

        if (ctx.IDENTIFIER() != null) {
            String attributeName = ctx.IDENTIFIER().getText();
            htmlAttributeNode.setAttributeName(attributeName);
            
            // Add to symbol table with location information
            Row row = new Row("htmlAttributeName", attributeName, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
        }

        if (ctx.htmlAttributeValue() != null) {
            htmlAttributeNode.setAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        
        if (ctx.CLASS() != null) {
            String attributeName = ctx.CLASS().getText();
            htmlAttributeNode.setAttributeName(attributeName);
        }
        
        if (ctx.directive() != null) {
            String attributeName = ctx.directive().getText();
            htmlAttributeNode.setAttributeName(attributeName);
            
            // Check if directive is valid (simple check for demonstration)
            if (!attributeName.startsWith("*") && !attributeName.startsWith("[") && !attributeName.startsWith("(")) {
                addError("templateErrors", "invalid_directive", 
                        "Invalid directive syntax: " + attributeName, ctx);
            }
        }

        return htmlAttributeNode;
    }
    
    @Override
    public HtmlContentNode visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContentNode htmlContentNode = new HtmlContentNode();
        
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                htmlContentNode.getHtmlContent().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                htmlContentNode.getExpContent().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        
        return htmlContentNode;
    }

    @Override
    public HtmlAttributeValueNode visitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx) {
        HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();

        if (ctx.STRINGLITERAL() != null) {
            htmlAttributeValueNode.setValue(ctx.STRINGLITERAL().getText());
        }

        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                htmlAttributeValueNode.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }

        return htmlAttributeValueNode;
    }

    @Override
    public Expression visitSingleExpression(AngularParser.SingleExpressionContext ctx) {
        Expression expression = new Expression();
        
        if (ctx.literal() != null) {
            expression.setLiteralExpression(visitLiteral(ctx.literal()));
            return expression;
        }
        else if (ctx.indexarray() != null) {
            expression.setIndexArray(visitIndexarray(ctx.indexarray()));
            return expression;
        }
        else if (ctx.arrayLiteral() != null) {
            expression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
            return expression;
        }
        else if (ctx.objectLiteral() != null) {
            expression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
            return expression;
        }
        else if (ctx.htmlElements() != null) {
            expression.setHtmlElementsNode(visitHtmlElements(ctx.htmlElements()));
            return expression;
        }
        else if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            expression.setIdentifier(identifier);
            
            // Check if the identifier is defined
            boolean isDefined = false;
            for (Row row : symbolTable.getRows()) {
                if ((row.getType().equals("NameOfVar") || row.getType().equals("FunctionName")) && 
                    row.getValue().equals(identifier)) {
                    isDefined = true;
                    break;
                }
            }
            
            if (!isDefined) {
                addError("variableErrors", "undefined_identifier", 
                        "Identifier '" + identifier + "' is not defined", ctx);
            }
            
            return expression;
        }
        else if (ctx.mustacheExpression() != null) {
            expression.setMustache(visitMustacheExpression(ctx.mustacheExpression()));
            return expression;
        }
        else if (ctx.singleExpressionCss() != null) {
            expression.setStyleContent(visitSingleExpressionCss(ctx.singleExpressionCss()));
            return expression;
        }
        else if (ctx.singleExpression().size() == 2 && ctx.DOT() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            expression.setLeft(left);
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setRight(right);
            
            // Check if the left side is defined (for property access)
            if (left.getIdentifier() != null) {
                boolean leftIsDefined = false;
                for (Row row : symbolTable.getRows()) {
                    if ((row.getType().equals("NameOfVar") || row.getType().equals("ClassName")) && 
                        row.getValue().equals(left.getIdentifier())) {
                        leftIsDefined = true;
                        break;
                    }
                }
                
                if (!leftIsDefined) {
                    addError("variableErrors", "undefined_object", 
                            "Object '" + left.getIdentifier() + "' is not defined for property access", ctx);
                }
            }
            
            return expression;
        }
        else if (ctx.singleExpression().size() == 2 && ctx.ASSIGN() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            expression.setLeft(left);
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setRight(right);
            
            // Check if the left side is assignable
            if (left.getIdentifier() != null) {
                // For demonstration, we'll consider all identifiers assignable
                // In a real compiler, you'd check if it's a constant, etc.
            } else if (left.getLeft() != null && left.getRight() != null) {
                // Property assignment, check if the object exists
                if (left.getLeft().getIdentifier() != null) {
                    boolean objectExists = false;
                    for (Row row : symbolTable.getRows()) {
                        if ((row.getType().equals("NameOfVar") || row.getType().equals("ClassName")) && 
                            row.getValue().equals(left.getLeft().getIdentifier())) {
                            objectExists = true;
                            break;
                        }
                    }
                    
                    if (!objectExists) {
                        addError("variableErrors", "undefined_object_assignment", 
                                "Cannot assign to property of undefined object '" + 
                                left.getLeft().getIdentifier() + "'", ctx);
                    }
                }
            } else {
                addError("variableErrors", "invalid_assignment_target", 
                        "Invalid assignment target", ctx);
            }
            
            return expression;
        }
        else if (ctx.singleExpression().size() == 2 && ctx.COLON() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            expression.setLeft(left);
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setRight(right);
            return expression;
        }

        return expression;
    }
    
    @Override
    public LiteralExpression visitLiteral(AngularParser.LiteralContext ctx) {
        LiteralExpression literalExpression = new LiteralExpression();
        
        if (ctx.BOOLEANLITERAL() != null) {
            literalExpression.setBooleanLiteral(Boolean.parseBoolean(ctx.BOOLEANLITERAL().getText()));
        }
        else if (ctx.DECIMALLITERAL() != null) {
            literalExpression.setDecimalLiteral(Double.parseDouble(ctx.DECIMALLITERAL().getText()));
        }
        else if (ctx.STRINGLITERAL() != null) {
            literalExpression.setStringLiteral(ctx.STRINGLITERAL().getText());
        }
        else {
            literalExpression.setNullLiteral(null);
        }

        return literalExpression;
    }
    
    @Override
    public ObjectLiteral visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        
        for (int i = 0; i < ctx.propertyAssignment().size(); i++) {
            if (ctx.propertyAssignment(i) != null) {
                objectLiteral.getProperties().add(visitPropertyAssignment(ctx.propertyAssignment(i)));
            }
        }
        
        return objectLiteral;
    }
    
    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment();
        
        if (ctx.singleExpression(0)!= null) {
            Expression key = visitSingleExpression(ctx.singleExpression(0));
            propertyAssignment.setKey(key);
        }
        
        if (ctx.singleExpression(1)!= null) {
            Expression value = visitSingleExpression(ctx.singleExpression(1));
            propertyAssignment.setValue(value);
        }
        
        return propertyAssignment;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                arrayLiteral.getElements().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        
        return arrayLiteral;
    }
    
    @Override
    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        
        String functionName = null;
        
        if(ctx.EXPORT()!=null)
        {
            functionDeclaration.setFunctionExport(ctx.EXPORT().getText());
        }
        
        if(ctx.IDENTIFIER()!=null)
        {
            functionName = ctx.IDENTIFIER().getText();
            functionDeclaration.setFunctionName(functionName);
            
            // Check for duplicate function declaration
            boolean isDuplicate = false;
            for (Row row : symbolTable.getRows()) {
                if (row.getType().equals("FunctionName") && row.getValue().equals(functionName)) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (isDuplicate) {
                addError("functionErrors", "duplicate_function", 
                        "Function '" + functionName + "' is already defined", ctx);
            }
            
            // Add to symbol table with location information
            Row row = new Row("FunctionName", functionName, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
            
            // Set current scope to this function for parameter and body processing
            String previousScope = currentScope;
            currentScope = functionName;
            
            // Process parameters
            for (int i = 0; i < ctx.singleExpression().size(); i++) {
                if (ctx.singleExpression(i) != null) {
                    Expression param = visitSingleExpression(ctx.singleExpression(i));
                    functionDeclaration.getParameters().add(param);
                    
                    // Add parameter to symbol table if it's an identifier
                    if (param.getIdentifier() != null) {
                        Row paramRow = new Row("Parameter", param.getIdentifier(), currentScope);
                        if (ctx.start != null) {
                            paramRow.setLineNumber(ctx.start.getLine());
                            paramRow.setColumnNumber(ctx.start.getCharPositionInLine());
                        }
                        symbolTable.addSymbol(paramRow);
                    }
                }
            }
            
            // Process function body
            for (int i = 0; i < ctx.statment().size(); i++) {
                if (ctx.statment(i) != null) {
                    functionDeclaration.getBody().add(visitStatment(ctx.statment(i)));
                }
            }
            
            // Restore previous scope
            currentScope = previousScope;
        }
        
        if(ctx.exportStatement()!=null)
        {
            functionDeclaration.setEx(visitExportStatement(ctx.exportStatement()));
        }
        
        return functionDeclaration;
    }

    @Override
    public VariableStatement visitVariableStatement(AngularParser.VariableStatementContext ctx) {
        VariableStatement variableStatement = new VariableStatement();
        
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration(i) != null) {
                variableStatement.getVariableDeclarations().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        
        return variableStatement;
    }
    
    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        
        if (ctx.assignable() != null) {
            variableDeclaration.setAssignable(visitAssignable(ctx.assignable()));
        }
        
        if (ctx.singleExpression() != null) {
            variableDeclaration.setExp(visitSingleExpression(ctx.singleExpression()));
        }
        
        return variableDeclaration;
    }
    
    @Override
    public Assignable visitAssignable(AngularParser.AssignableContext ctx) {
        Assignable assignable = new Assignable();

        if (ctx.arrayLiteral() != null) {
            assignable.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        } else if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            assignable.setName(varName);
            
            // Check for duplicate variable declaration in the same scope
            boolean isDuplicate = false;
            for (Row row : symbolTable.getRows()) {
                if (row.getType().equals("NameOfVar") && row.getValue().equals(varName) && 
                    (row.getScope() == null || row.getScope().equals(currentScope))) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (isDuplicate) {
                addError("variableErrors", "duplicate_variable", 
                        "Variable '" + varName + "' is already defined in this scope", ctx);
            }
            
            // Add to symbol table with location and scope information
            Row row = new Row("NameOfVar", varName, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
        }

        return assignable;
    }
    
    @Override
    public ExpressionStatement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement = new ExpressionStatement();
        
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                expressionStatement.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        
        return expressionStatement;
    }
    
    @Override
    public Export visitExportStatement(AngularParser.ExportStatementContext ctx) {
        Export export = new Export();
        
        if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            export.setIdentifier(identifier);
            
            // Check if the exported identifier exists
            boolean identifierExists = false;
            for (Row row : symbolTable.getRows()) {
                if ((row.getType().equals("NameOfVar") || row.getType().equals("FunctionName") || 
                     row.getType().equals("ClassName")) && row.getValue().equals(identifier)) {
                    identifierExists = true;
                    break;
                }
            }
            
            if (!identifierExists) {
                addError("scopeErrors", "undefined_export", 
                        "Attempting to export undefined identifier: " + identifier, ctx);
            }
        }
        
        return export;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        
        if(ctx.IDENTIFIER()!=null) {
            String className = ctx.IDENTIFIER().getText();
            classDeclaration.setClassName(className);
            
            // Check for duplicate class declaration
            boolean isDuplicate = false;
            for (Row row : symbolTable.getRows()) {
                if (row.getType().equals("ClassName") && row.getValue().equals(className)) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (isDuplicate) {
                addError("scopeErrors", "duplicate_class", 
                        "Class '" + className + "' is already defined", ctx);
            }
            
            // Add to symbol table with location information
            Row row = new Row("ClassName", className, currentScope);
            if (ctx.start != null) {
                row.setLineNumber(ctx.start.getLine());
                row.setColumnNumber(ctx.start.getCharPositionInLine());
            }
            symbolTable.addSymbol(row);
            
            // Set current scope to this class for body processing
            String previousScope = currentScope;
            currentScope = className;
            
            if(ctx.classBody()!=null){
                classDeclaration.setClassBody(visitClassBody(ctx.classBody()));
            }
            
            // Restore previous scope
            currentScope = previousScope;
        }
        
        return classDeclaration;
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();

        for (int i=0; i<ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                classBody.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }

        return classBody;
    }

    @Override
    public MustachExpression visitMustacheExpression(AngularParser.MustacheExpressionContext ctx) {
        MustachExpression mustachExpression = new MustachExpression();
        
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                Expression expr = visitSingleExpression(ctx.singleExpression(i));
                mustachExpression.getExpContent().add(expr);
                
                // Check if the expression references defined variables
                if (expr.getIdentifier() != null) {
                    String identifier = expr.getIdentifier();
                    boolean isDefined = false;
                    
                    for (Row row : symbolTable.getRows()) {
                        if ((row.getType().equals("NameOfVar") || row.getType().equals("Parameter")) && 
                            row.getValue().equals(identifier)) {
                            isDefined = true;
                            break;
                        }
                    }
                    
                    if (!isDefined) {
                        addError("templateErrors", "undefined_mustache_variable", 
                                "Mustache expression references undefined variable: " + identifier, ctx);
                    }
                }
            }
        }
        
        return mustachExpression;
    }

    @Override
    public Selector visitSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx) {
        Selector selector = new Selector();
        
        if(ctx.COLON()!=null){
            selector.setColon(ctx.COLON().getText());
        }
        
        if(ctx.SELECTOR()!=null){
            selector.setSelector(ctx.SELECTOR().getText());
        }
        
        if(ctx.STRINGLITERAL()!=null){
            String selectorValue = ctx.STRINGLITERAL().getText();
            selector.setApp_root(selectorValue);
            
            // Check if selector follows Angular naming conventions (simple check)
            if (selectorValue.length() <= 2 || !selectorValue.contains("-")) {
                addError("componentErrors", "invalid_selector", 
                        "Component selector should follow Angular naming conventions (e.g., 'app-root'): " + 
                        selectorValue, ctx);
            }
        } else {
            // Missing selector value
            addError("componentErrors", "missing_selector_value", 
                    "Component selector declaration is missing a value", ctx);
        }
        
        return selector;
    }

    @Override
    public Standalone visitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx) {
        Standalone standalone = new Standalone();
        
        if(ctx.STANDALONE()!=null){
            standalone.setStandalone(ctx.STANDALONE().getText());
        }
        
        if(ctx.COLON()!=null){
            standalone.setColon(ctx.COLON().getText());
        }
        
        if(ctx.BOOLEANLITERAL()!=null){
            String booleanText = ctx.BOOLEANLITERAL().getText();
            boolean booleanValue = Boolean.parseBoolean(booleanText);
            standalone.setBooleanvalue(booleanValue);
        } else {
            // Missing boolean value
            addError("componentErrors", "missing_standalone_value", 
                    "Standalone declaration is missing a boolean value", ctx);
        }
        
        return standalone;
    }

    @Override
    public Imports visitImportsDeclaration(AngularParser.ImportsDeclarationContext ctx) {
        Imports imports = new Imports();
        
        if(ctx.COLON()!=null){
            imports.setColon(ctx.COLON().getText());
        }
        
        if(ctx.IMPORTS()!=null){
            imports.setImports(ctx.IMPORTS().getText());
        }
        
        if(ctx.arrayLiteral()!=null){
            imports.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        } else {
            // Missing imports array
            addError("componentErrors", "missing_imports_array", 
                    "Imports declaration is missing an array of imports", ctx);
        }
        
        return imports;
    }

    @Override
    public Styles visitStylesDeclaration(AngularParser.StylesDeclarationContext ctx) {
        Styles styles = new Styles();
        
        if(ctx.STYLES()!=null){
            styles.setStyle(ctx.STYLES().getText());
        }
        
        if(ctx.COLON()!=null){
            styles.setColon(ctx.COLON().getText());
        }
        
        if(ctx.arrayLiteral()!=null){
            styles.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        } else {
            // Missing styles array
            addError("componentErrors", "missing_styles_array", 
                    "Styles declaration is missing an array of styles", ctx);
        }
        
        return styles;
    }

    @Override
    public StyleContent visitSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx) {
        StyleContent styleContent = new StyleContent();

        if(ctx.IDENTIFIER()!=null){
            styleContent.setClassName(ctx.IDENTIFIER().getText());
        }
        
        if(ctx.objectLiteral()!=null){
            styleContent.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        
        return styleContent;
    }
    
    @Override
    public forStatement visitForstatment(AngularParser.ForstatmentContext ctx) {
        forStatement fs = new forStatement();
        
        // Set current scope to a special for-loop scope
        String previousScope = currentScope;
        currentScope = currentScope + ".forLoop";
        
        if (ctx.variableStatement() != null) {
            fs.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        
        if (ctx.singleExpression(1) != null) {
            fs.setIncrement(visitSingleExpression(ctx.singleExpression(1)));
        }
        
        if (ctx.singleExpression(2) != null) {
            fs.setBody(visitSingleExpression(ctx.singleExpression(2)));
        }
        
        // Restore previous scope
        currentScope = previousScope;
        
        return fs;
    }

    @Override
    public IndexArray visitIndexarray(AngularParser.IndexarrayContext ctx) {
        IndexArray indexArray = new IndexArray();
        
        if(ctx.IDENTIFIER()!=null){
            String identifier = ctx.IDENTIFIER().getText();
            indexArray.setIdentifier(identifier);
            
            // Check if the array variable is defined
            boolean isDefined = false;
            for (Row row : symbolTable.getRows()) {
                if (row.getType().equals("NameOfVar") && row.getValue().equals(identifier)) {
                    isDefined = true;
                    break;
                }
            }
            
            if (!isDefined) {
                addError("variableErrors", "undefined_array", 
                        "Array variable '" + identifier + "' is not defined", ctx);
            }
        }
        
        if(ctx.DECIMALLITERAL()!=null){
            indexArray.setIndex(ctx.DECIMALLITERAL().getChildCount());
        }
        
        return indexArray;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
};

