package AST;

public class IfStatement {
    String ifNode;
    String elseIfNode;
    String elseNode;
    Expression cond;
    Expression body;

    public String getIfNode() {
        return ifNode;
    }

    public void setIfNode(String ifNode) {
        this.ifNode = ifNode;
    }

    public String getElseIfNode() {
        return elseIfNode;
    }

    public void setElseIfNode(String elseIfNode) {
        this.elseIfNode = elseIfNode;
    }

    public String getElseNode() {
        return elseNode;
    }

    public void setElseNode(String elseNode) {
        this.elseNode = elseNode;
    }

    public Expression getCond() {
        return cond;
    }

    public void setCond(Expression cond) {
        this.cond = cond;
    }

    public Expression getBody() {
        return body;
    }

    public void setBody(Expression body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (ifNode != null) {
            sb.append(ifNode);
        }

        if (elseIfNode != null) {
            sb.append(elseIfNode);
        }

        if (elseNode != null) {
            sb.append(elseNode);
        }

        if (cond != null)   {
            sb.append("(").append(cond).append(")");
        }
        if(body != null){
            sb.append("{").append(body).append("}");
        }
return sb.toString();

}
}
