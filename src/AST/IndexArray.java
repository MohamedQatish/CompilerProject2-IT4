package AST;

public class IndexArray {
  String identifier;
  String index;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = String.valueOf(index);
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       if(identifier!=null){
           sb.append(identifier).append("[").append(index).append("]");
       }


       return sb.toString();
    }
}
