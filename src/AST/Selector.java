package AST;

public class Selector {
    String selector;
    String colon;
    String app_root;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getApp_root() {
        return app_root;
    }

    public void setApp_root(String app_root) {
        this.app_root = app_root;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(selector!=null){
            sb.append(selector);
        }
        if(colon!=null){
            sb.append(colon);
        }
        if(app_root!=null){
            sb.append("{selector name}").append(app_root).append(" ,").append('\n');
        }

        return sb.toString();
    }
}
