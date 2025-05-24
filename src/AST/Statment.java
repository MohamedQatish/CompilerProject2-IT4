package AST;

public  class Statment  {
    FunctionDeclaration functionDeclaration;
    VariableStatement variableStatement;
    ExpressionStatement expressionStatement ;
    ComponentDeclaration componentDeclaration;
    ClassDeclaration classDeclaration;

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (functionDeclaration != null) {
            sb.append(" functionDeclaration=").append(functionDeclaration).append('\n');
        }
        if (variableStatement != null) {
            sb.append(" variableStatement = ").append(variableStatement).append('\n')  ;
        }
        if (expressionStatement != null) {
            sb.append(expressionStatement);
        }
        if (componentDeclaration != null) {


            sb.append(" componentDeclaration = {").append(componentDeclaration);
        }
        if (classDeclaration != null) {


            sb.append(" class Declaration = {").append(classDeclaration);
        }
        return sb.toString();
    }

}
