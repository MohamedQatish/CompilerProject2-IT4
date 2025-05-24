package AST;

import java.util.ArrayList;
import java.util.List;

public class AnoymousFunction  {
    List<Expression> parameters =new ArrayList<Expression>();
    List<Statment>body=new ArrayList<Statment>();
    Export export;

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }

    public List<Statment> getBody() {
        return body;
    }

    public void setBody(List<Statment> body) {
        this.body = body;
    }

    public Export getExport() {
        return export;
    }

    public void setExport(Export export) {
        this.export = export;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnonymousFunction {").append('\n');
        if (parameters != null && !parameters.isEmpty()) {
            sb.append("parametersAnonymous= ( ");
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i));
                if (i < parameters.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ) ").append('\n');
        }
        if (body != null && !body.isEmpty()) {
            sb.append("bodyAnonymous = { ");
            for (int i = 0; i < body.size(); i++) {
                sb.append(body.get(i));
                if (i < body.size() - 1) {
                    sb.append(" , ");
                }
            }
            sb.append(" } ").append('\n');
        }

        sb.append('}');
        if(export != null){
            sb.append(export);}
        return sb.toString();
    }
}
