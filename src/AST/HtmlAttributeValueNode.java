package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributeValueNode  {
     String value;

     List<Expression> expressions= new ArrayList<Expression>();

    public String getValue() {
        return value;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public void setValue(String value) {
        this.value = value;
    }



@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    if(value!=null) {
        sb.append(value);
    }
    if (expressions != null) {


        for (int i = 0; i < expressions.size(); i++) {
            sb.append(expressions.get(i));
            if (i < expressions.size() - 1) {
                sb.append(", ");
            }
        }

    }

    return sb.toString();
}


}
