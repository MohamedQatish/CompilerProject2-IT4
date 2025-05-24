package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    ImportStatmente importStatement;
    List<Statment> sourceElement= new ArrayList<Statment>();

    public List<Statment> getSourceElement() {
        return sourceElement;
    }

    public void setSourceElement(List<Statment> sourceElement) {
        this.sourceElement = sourceElement;
    }

    public ImportStatmente getImportStatement() {
        return importStatement;
    }



    public void setImportStatement(ImportStatmente importStatement) {
        this.importStatement = importStatement;
    }

    @Override
    public String toString() {
        return "Program { " + '\n' +
                "importStatement = " + importStatement + '\n' +
                "statment =" + sourceElement+
                '}';
    }
}
