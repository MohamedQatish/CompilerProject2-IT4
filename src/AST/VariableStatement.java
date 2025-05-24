package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableStatement {
     List<VariableDeclaration> variableDeclarations= new ArrayList<VariableDeclaration>();

    public List<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(List<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    @Override
    public String toString() {
        return " " +
                variableDeclarations + ' ';
    }
}
