package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral {
     List<Expression> elements= new ArrayList<Expression>();
    public void setElements(List<Expression> elements) {
        this.elements = elements;
    }

    public List<Expression> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        if (elements != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ArrayLiteral {").append('\n');
            sb.append("elements = ");
            sb.append(" [ ");
            for (int i = 0; i < elements.size(); i++) {
                sb.append(elements.get(i));
                if (i < elements.size() - 1) {
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
