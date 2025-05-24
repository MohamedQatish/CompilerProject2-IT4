package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration  {
    String functionExport;
     String functionName;
     List<Expression> parameters= new ArrayList<Expression>();
     List<Statment> body =new ArrayList<Statment>();;
     Export ex ;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionExport() {
        return functionExport;
    }

    public void setFunctionExport(String functionExport) {
        this.functionExport = functionExport;
    }

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

    public Export getEx() {
        return ex;
    }

    public void setEx(Export ex) {
        this.ex = ex;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (functionExport != null)
        sb.append(functionExport);
        if (functionName != null)
            sb.append(" functionName = ").append(functionName).append('\n');
        if (parameters != null) {
        sb.append(" parametersFunction = ( ");
            for (Expression parameter : parameters) {
                if (parameter != null) {
                    sb.append(parameter).append(", ");
                }
            }
            sb.append(" ) ").append('\n');
        }

        if (body != null) {
            sb.append(" bodyFunction = { ");
            for (Statment b : body) {
                if (b != null) {
                    sb.append(b).append(",");
                }
            }
            sb.append(" } ").append('\n');
        }
        if (ex !=null)
        sb.append(ex);
        return sb.toString();
    }
}
