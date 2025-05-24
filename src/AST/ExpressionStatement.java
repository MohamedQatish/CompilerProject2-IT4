package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpressionStatement  {
    private List<Expression> expressions= new ArrayList<Expression>();
    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) {
                sb.append(" , ");
            }
            sb.append(expressions.get(i));
        }
        return sb.toString();
    }
}
