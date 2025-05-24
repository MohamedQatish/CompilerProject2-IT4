package AST;

public class PlusPlusExpression  {
     Expression expression;
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        if (expression != null)
        return "PlusPlusExpression{" +
                "expression=" + expression +
                '}';
        else return "PlusPlusExpression{" + null + '}';
    }
}
