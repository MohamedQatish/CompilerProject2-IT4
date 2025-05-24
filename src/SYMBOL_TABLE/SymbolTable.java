package SYMBOL_TABLE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SymbolTable {

    private List<Row> rows = new ArrayList<>();
    

    private Map<String, ErrorSymbolTable> errorTables = new HashMap<>();
    

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    

    public void addSymbol(Row row) {
        rows.add(row);
    }

    public ErrorSymbolTable getErrorTable(String category) {
        if (!errorTables.containsKey(category)) {
            errorTables.put(category, new ErrorSymbolTable(category));
        }
        return errorTables.get(category);
    }
    

    public void addErrorTable(String category) {
        if (!errorTables.containsKey(category)) {
            errorTables.put(category, new ErrorSymbolTable(category));
        }
    }
    

    public void addError(String category, SemanticError error) {
        getErrorTable(category).addError(error);
    }
    

    public boolean hasErrors() {
        for (ErrorSymbolTable table : errorTables.values()) {
            if (table.hasErrors()) {
                return true;
            }
        }
        return false;
    }

    public void printSymbols() {
        System.out.println("=== Symbol Table ===");
        System.out.println("Type\t\t\t\t\t\t\t\tValue\t\t\t\t\tScope\t\t\t\t\tLine:Column");
        System.out.println("------------------------------------------------------------------------------");

        for (Row row : rows) {
            if (row != null) {
                String type = row.getType();
                String value = row.getValue();
                String scope = row.getScope() != null ? row.getScope() : "";
                String location = row.getLineNumber() > 0 ? row.getLineNumber() + ":" + row.getColumnNumber() : "";


                String formattedType = String.format("%-20s", type);
                String formattedValue = String.format("%-20s", value);
                String formattedScope = String.format("%-20s", scope);

                System.out.println(formattedType + "\t\t\t" + '|' + "\t\t\t" + formattedValue + 
                                  "\t\t\t" + formattedScope + "\t\t\t" + location);
            }
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
    }
    

    public void printErrors() {
        if (!hasErrors()) {
            System.out.println("No semantic errors found.");
            return;
        }
        
        System.out.println("=== Semantic Errors ===");
        for (ErrorSymbolTable table : errorTables.values()) {
            if (table.hasErrors()) {
                table.printErrors();
            }
        }
    }
    

    public void printyy() {
        printSymbols();
        printErrors();
    }
    

    public Map<String, ErrorSymbolTable> getErrorTables() {
        return errorTables;
    }
    

    public boolean symbolExists(String type, String value) {
        for (Row row : rows) {
            if (row.getType().equals(type) && row.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
    

    public boolean symbolExists(String type, String value, String scope) {
        for (Row row : rows) {
            if (row.getType().equals(type) && row.getValue().equals(value) && 
                (row.getScope() == null || row.getScope().equals(scope))) {
                return true;
            }
        }
        return false;
    }
    

    public Row findSymbol(String type, String value) {
        for (Row row : rows) {
            if (row.getType().equals(type) && row.getValue().equals(value)) {
                return row;
            }
        }
        return null;
    }
    

    public Row findSymbol(String type, String value, String scope) {
        for (Row row : rows) {
            if (row.getType().equals(type) && row.getValue().equals(value) && 
                (row.getScope() == null || row.getScope().equals(scope))) {
                return row;
            }
        }
        return null;
    }
}
