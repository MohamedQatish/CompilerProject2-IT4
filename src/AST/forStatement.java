package AST;

public class forStatement {
VariableStatement variableStatement;
Expression increment;
Expression body;

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public Expression getIncrement() {
        return increment;
    }

    public void setIncrement(Expression increment) {
        this.increment = increment;
    }

    public Expression getBody() {
        return body;
    }

    public void setBody(Expression body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "for ("
               + variableStatement +"cond ;"+
               increment +") " +" {"+
                body +
                '}';
    }
}
