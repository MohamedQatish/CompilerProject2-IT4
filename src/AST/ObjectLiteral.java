package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral  {
     List<PropertyAssignment> properties = new ArrayList<PropertyAssignment>();
    public List<PropertyAssignment> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyAssignment> properties) {
        this.properties = properties;
    }
    @Override
    public String toString() {
        if (properties != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ObjectLiteral { ").append('\n');
            sb.append("properties = ");
            sb.append(" [ ");
            for (int i = 0; i < properties.size(); i++) {
                sb.append(properties.get(i));
                if (i < properties.size() - 1) {
                    sb.append(" , ");
                }
            }
            sb.append(" ] ").append('\n');
            sb.append(" } ").append('\n');
            return sb.toString();
        }

        return null;
    }
}
