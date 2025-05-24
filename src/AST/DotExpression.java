package AST;

public class DotExpression {
     Expression leftDotExpression;
     Expression rightDotExpression;
    public void setLeftDotExpression(Expression leftDotExpression) {
        this.leftDotExpression = leftDotExpression;
    }

    public Expression getLeftExpression() {
        return leftDotExpression;
    }

    public void setRightDotExpression(Expression rightDotExpression) {
        this.rightDotExpression = rightDotExpression;
    }

    public Expression getRightExpression() {
        return rightDotExpression;
    }

    @Override
    public String toString() {
        if (leftDotExpression !=null)
            return "DotExpression{" +
                    "leftDotExpression=" + leftDotExpression +'}';
        if (rightDotExpression!=null)
        return "DotExpression{" +" rightDotExpression=" + rightDotExpression + '}';

        else   return "DotExpression{" + null + '}';
    }
}
