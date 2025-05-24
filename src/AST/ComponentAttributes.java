package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentAttributes {

    List<ComponentAttribute> componentAttribute =new ArrayList<ComponentAttribute>();

    public List<ComponentAttribute> getComponentAttribute() {
        return componentAttribute;
    }

    public void setComponentAttribute(List<ComponentAttribute> componentAttribute) {
        this.componentAttribute = componentAttribute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Component Body = { ");
        if (componentAttribute != null) {
            for (ComponentAttribute b : componentAttribute) {
                if (b != null) {
                    sb.append(b).append(",");
                }
            }
        }
        sb.append(" } ").append('\n');
        return sb.toString();
    }
}


