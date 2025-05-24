package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementsNode {
     List<HtmlElementNode> htmlElements= new ArrayList<HtmlElementNode>();
    public List<HtmlElementNode> getHtmlElements() {
        return htmlElements;
    }


    public void setHtmlElements(List<HtmlElementNode> htmlElements) {
        this.htmlElements = htmlElements;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("htmlElements");
        for (HtmlElementNode htmlElement : htmlElements) {
            sb.append(htmlElement).append("\n");
        }
        return sb.toString();
    }
}
