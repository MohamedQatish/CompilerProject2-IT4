package AST;

public class ModuleItems {
    String identifier1;
    String identifier2;
String Component;
String CommonModule;

    public String getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(String identifier1) {
        this.identifier1 = identifier1;
    }

    public String getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(String identifier2) {
        this.identifier2 = identifier2;
    }

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public String getCommonModule() {
        return CommonModule;
    }

    public void setCommonModule(String commonModule) {
        CommonModule = commonModule;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
sb.append('{');
        if(identifier1!=null){
    sb.append("identifier1=");
    sb.append(identifier1);
      }
        if(identifier2!=null){
            sb.append("identifier2=");
            sb.append(identifier2);
        }
        if(Component!=null){
            sb.append("Component=");
            sb.append(Component);
        }
        if(CommonModule!=null){
            sb.append("CommonModule=");
            sb.append(CommonModule);
        }
        return sb.toString();
    }
}
