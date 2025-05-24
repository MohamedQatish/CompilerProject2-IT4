package AST;

public class Export {
    String identifier;
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "export default " + identifier + ";";
    }
}
