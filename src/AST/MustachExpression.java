package AST;

import java.util.ArrayList;
import java.util.List;

public class MustachExpression {
    String OpenBrac;
     List<Expression> expContent= new ArrayList<Expression>();

    String CloseBrac;

    public List<Expression> getExpContent() {
        return expContent;
    }

    public void setExpContent(List<Expression> expContent) {
        this.expContent = expContent;
    }

    public String getOpenBrac() {
        return OpenBrac;
    }

    public void setOpenBrac(String openBrac) {
        OpenBrac = openBrac;
    }



    public String getCloseBrac() {
        return CloseBrac;
    }

    public void setCloseBrac(String closeBrac) {
        CloseBrac = closeBrac;
    }


    @Override
    public String toString() {
   StringBuilder sb=new StringBuilder();
        sb.append("mustache Statment { ");

        if (expContent != null)

        {
            for (int i = 0; i < expContent.size(); i++) {
                Expression expression = expContent.get(i);
                sb.append(expression);
                if (i < expContent.size() - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append(" } ");
        return sb.toString();
}
}
