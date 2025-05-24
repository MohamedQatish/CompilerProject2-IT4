package AST;

public class AssignExpression {

     Expression leftAssignExpression;
     Expression rightAssignExpression;

    public Expression getLeftExpression() {
        return leftAssignExpression;
    }

    public void setLeftAssignExpression(Expression leftAssignExpression) {
        this.leftAssignExpression = leftAssignExpression;
    }

    public Expression getRightExpression() {
        return rightAssignExpression;
    }

    public void setRightAssignExpression(Expression rightAssignExpression) {
        this.rightAssignExpression = rightAssignExpression;
    }

    @Override
    public String toString() {
        if (leftAssignExpression !=null)
            return "AssignExpression{" +
                    "leftAssignExpression=" + leftAssignExpression +'}';
        if (rightAssignExpression!=null)
            return "AssignExpression{" +" rightAssignExpression=" + rightAssignExpression + '}';

        else   return "AssignExpression{" + null + '}';
    }
}
