package AST;

public class VariableDeclaration  {
     Expression exp;
     Assignable assignable;
    public Assignable getAssignable() {
        return assignable;
    }

    public Expression getExp() {
        return exp;
    }

    public void setExp(Expression exp) {
        this.exp = exp;
    }

    public void setAssignable(Assignable assignable) {
        this.assignable = assignable;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (assignable != null) {
            sb.append(assignable);
        }

        if (exp != null) {
            sb.append(" = ").append(exp);
        }

        return sb.toString();
    }
}
