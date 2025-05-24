package AST;

import java.util.ArrayList;
import java.util.List;

public class NgForExpression {
    String varmod;
    String of;
    private List<Expression> expressions= new ArrayList<Expression>();

    public String getVarmod() {
        return varmod;
    }

    public void setVarmod(String varmod) {
        this.varmod = varmod;
    }

    public String getOf() {
        return of;
    }

    public void setOf(String of) {
        this.of = of;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
          if(of!=null){
              sb.append(of);
          }
        if(varmod!=null){
            sb.append(varmod);
        }
        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) {
                sb.append(" , ");
            }
            sb.append(expressions.get(i));
        }
        return sb.toString();
    }
}
