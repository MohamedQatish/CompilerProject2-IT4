package SYMBOL_TABLE;


public class Row {
    private String type;
    private String value;
    private String scope;
    private int lineNumber;
    private int columnNumber;


    public Row() {
        this.lineNumber = -1;
        this.columnNumber = -1;
    }


    public Row(String type, String value) {
        this.type = type;
        this.value = value;
        this.lineNumber = -1;
        this.columnNumber = -1;
    }


    public Row(String type, String value, String scope) {
        this.type = type;
        this.value = value;
        this.scope = scope;
        this.lineNumber = -1;
        this.columnNumber = -1;
    }


    public Row(String type, String value, String scope, int lineNumber, int columnNumber) {
        this.type = type;
        this.value = value;
        this.scope = scope;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public String getScope() {
        return scope;
    }


    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getLineNumber() {
        return lineNumber;
    }


    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    public int getColumnNumber() {
        return columnNumber;
    }


    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }


    public String getLocation() {
        if (lineNumber <= 0) {
            return "";
        }
        return lineNumber + ":" + columnNumber;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(type).append(", ");
        sb.append("Value: ").append(value);
        
        if (scope != null && !scope.isEmpty()) {
            sb.append(", Scope: ").append(scope);
        }
        
        if (lineNumber > 0) {
            sb.append(", Location: ").append(getLocation());
        }
        
        return sb.toString();
    }
}
