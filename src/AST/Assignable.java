package AST;

public class Assignable  {
    ArrayLiteral arrayLiteral;
    String name;
    String map;

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (arrayLiteral != null) {
            sb.append(arrayLiteral);
        }

        if (name != null) {
            sb.append("name : ").append(name);

        }

        if (map != null) {
            sb.append(map);
        }

        return sb.toString();
    }
}
