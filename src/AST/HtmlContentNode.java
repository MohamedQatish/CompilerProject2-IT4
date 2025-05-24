package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContentNode  {
    private List<Expression> expContent= new ArrayList<Expression>();
    private List<HtmlElementNode> htmlContent= new ArrayList<HtmlElementNode>();

    public List<Expression> getExpContent() {
        return expContent;
    }
    MustachExpression mustachExpression;

    public MustachExpression getMustachExpression() {
        return mustachExpression;
    }

    public void setMustachExpression(MustachExpression mustachExpression) {
        this.mustachExpression = mustachExpression;
    }

    public void setExpContent(List<Expression> expContent) {
        this.expContent = expContent;
    }

    public List<HtmlElementNode> getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(List<HtmlElementNode> htmlContent) {
        this.htmlContent = htmlContent;


    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (htmlContent != null) {
            for (HtmlElementNode htmlElement : htmlContent) {
                sb.append(htmlElement).append(" ");
            }
        }
        if (expContent != null) {
            for (Expression expression : expContent) {
                sb.append(expression).append(", ");
            }
        }

        return sb.toString();
    }
}
