package AST;

import java.util.ArrayList;
import java.util.List;

public class ReturnStatement  {
     List<Expression> expressions= new ArrayList<Expression>();

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReturnStatement { ");

        if (expressions != null)
             {
            for (int i = 0; i < expressions.size(); i++) {
                Expression expression = expressions.get(i);
                sb.append(expression);
                if (i < expressions.size() - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append(" } ");

        return sb.toString();
    }

}
