package AST;

public class Imports {
    String imports;
    String Colon;
    ArrayLiteral arrayLiteral;

    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public String getColon() {
        return Colon;
    }

    public void setColon(String colon) {
        Colon = colon;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public String toString() {
     StringBuilder sb=new StringBuilder();

     if(imports!=null){
         sb.append(imports);
     }
        if(Colon!=null){
            sb.append(Colon);
        }
        if(arrayLiteral!=null){
            sb.append(arrayLiteral);
        }



     return sb.toString();
    }
}
