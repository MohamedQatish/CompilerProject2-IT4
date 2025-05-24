package AST;

public class PropertyAssignment  {
     Expression key;
     Expression value;

    public Expression getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }

    public void setKey(Expression key) {
        this.key = key;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (key != null) {

            stringBuilder.append("key = ").append(key).append(" : ")
            .append(" value = ").append(value).append('\n');
        }


        return stringBuilder.toString();
    }
}
