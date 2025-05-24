package AST;

public class Identifier {
     String identifier;
     String map;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }


    @Override
    public String toString() {
        if (identifier != null) {
            return identifier;
        } else if (map != null){
            return map;
        }
        else return null;
    }
}
