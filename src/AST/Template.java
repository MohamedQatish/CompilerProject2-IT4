package AST;

public class Template {
    String template;
    String Colon;
    String BackTick1;
    String BackTick2;
    HtmlElementsNode htmlElementsNode;

    public HtmlElementsNode getHtmlElementsNode() {
        return htmlElementsNode;
    }

    public void setHtmlElementsNode(HtmlElementsNode htmlElementsNode) {
        this.htmlElementsNode = htmlElementsNode;
    }

    public String getBackTick2() {
        return BackTick2;
    }

    public void setBackTick2(String backTick2) {
        BackTick2 = backTick2;
    }



    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getColon() {
        return Colon;
    }

    public void setColon(String colon) {
        Colon = colon;
    }

    public String getBackTick1() {
        return BackTick1;
    }

    public void setBackTick1(String backTick1) {
        BackTick1 = backTick1;
    }



    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        if(template!=null)
            sb.append(template);
        if(Colon!=null)
            sb.append(Colon);
        if(BackTick1!=null)
            sb.append(BackTick1);

        if(htmlElementsNode!=null)
            sb.append(htmlElementsNode);

        if(BackTick2!=null)
            sb.append(BackTick2);
        return sb.toString();
    }


}
