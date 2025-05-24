package AST;

public class ComponentDeclaration {

    ComponentAttributes componentAttributes;

    public ComponentAttributes getComponentAttributes() {
        return componentAttributes;
    }

    public void setComponentAttributes(ComponentAttributes componentAttributes) {
        this.componentAttributes = componentAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

    if(componentAttributes!=null){
        sb.append(componentAttributes);
    }
sb.append("}");
        return sb.toString();
    }
}
