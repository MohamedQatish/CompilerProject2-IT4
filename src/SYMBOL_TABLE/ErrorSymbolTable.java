package SYMBOL_TABLE;
import java.util.ArrayList;
import java.util.List;


public class ErrorSymbolTable {
    private String errorCategory;  // Category of errors in this table
    private List<SemanticError> errors = new ArrayList<>();
    

    public ErrorSymbolTable(String errorCategory) {
        this.errorCategory = errorCategory;
    }

    public String getErrorCategory() {
        return errorCategory;
    }
    

    public void setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
    }

    public void addError(SemanticError error) {
        errors.add(error);
    }
    

    public List<SemanticError> getErrors() {
        return errors;
    }
    

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
    

    public void printErrors() {
        if (!hasErrors()) {
            System.out.println("No " + errorCategory + " errors found.");
            return;
        }
        
        System.out.println("=== " + errorCategory + " Errors ===");
        for (SemanticError error : errors) {
            System.out.println(error);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error Category: ").append(errorCategory).append("\n");
        sb.append("Error Count: ").append(errors.size()).append("\n");
        
        if (hasErrors()) {
            sb.append("Errors:\n");
            for (SemanticError error : errors) {
                sb.append("  ").append(error).append("\n");
            }
        }
        
        return sb.toString();
    }
}
