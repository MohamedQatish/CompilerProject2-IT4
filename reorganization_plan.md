# Project Reorganization Plan

## Directory Structure
```
reorganized_project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── ANTLR/         # Generated parser and lexer files
│   │   │   ├── AST/           # Abstract Syntax Tree classes
│   │   │   ├── SYMBOL_TABLE/  # Symbol table and error handling
│   │   │   ├── VISITOR/       # Visitor implementation
│   │   │   └── Main.java      # Entry point
│   │   └── resources/         # Grammar files and other resources
├── TEST_FILES/                # Test files
├── bin/                       # Compiled class files
├── lib/                       # External libraries
└── scripts/                   # Build and run scripts
```

## File Mapping

### ANTLR/ Directory
- AngularLexer.java
- AngularParser.java
- AngularParserBaseListener.java
- AngularParserBaseVisitor.java
- AngularParserListener.java
- AngularParserVisitor.java

### AST/ Directory
- AnoymousFunction.java
- ArrayLiteral.java
- AssignExpression.java
- Assignable.java
- ClassBody.java
- ClassDeclaration.java
- ComponentAttribute.java
- ComponentAttributes.java
- ComponentDeclaration.java
- DotExpression.java
- Export.java
- Expression.java
- ExpressionStatement.java
- FunctionDeclaration.java
- HtmlAttributeNode.java
- HtmlAttributeValueNode.java
- HtmlContentNode.java
- HtmlElementNode.java
- HtmlElementsNode.java
- Identifier.java
- IfStatement.java
- ImportFromBlock.java
- ImportStatmente.java
- Imports.java
- IndexArray.java
- LiteralExpression.java
- ModuleItems.java
- MustachExpression.java
- NgForExpression.java
- ObjectLiteral.java
- PlusPlusExpression.java
- Program.java
- PropertyAssignment.java
- ReturnStatement.java
- Selector.java
- Standalone.java
- Statment.java
- StyleContent.java
- Styles.java
- Template.java
- VariableDeclaration.java
- VariableStatement.java
- forStatement.java

### SYMBOL_TABLE/ Directory
- Row.java
- SemanticError.java
- SymbolTable.java
- ErrorSymbolTable.java

### VISITOR/ Directory
- BaseVisitor.java

### Root src/main/java/ Directory
- Main.java
- CompilerRunner.java

### Resources Directory
- AngularLexer.g4
- AngularParser.g4
- AngularLexer.interp
- AngularParser.interp
- AngularLexer.tokens
- AngularParser.tokens

### Scripts Directory
- run_compiler.sh

### Project Root
- README.md
- CompilerProject.iml
- .gitignore

### TEST_FILES/ Directory
- test_semantic_errors.ts
- test_valid_component.ts
