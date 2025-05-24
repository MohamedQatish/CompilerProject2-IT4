package SYMBOL_TABLE;


public class SemanticError {
    private String errorType;
    private String errorMessage;
    private String location;
    private String context;


    public SemanticError(String errorType, String errorMessage, String location, String context) {
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.location = location;
        this.context = context;
    }


    public String getErrorType() {
        return errorType;
    }


    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }


    public String getErrorMessage() {
        return errorMessage;
    }


    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getContext() {
        return context;
    }


    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Error: " + errorType + " - " + errorMessage + 
               " at " + location + 
               (context != null && !context.isEmpty() ? " in " + context : "");
    }
}
