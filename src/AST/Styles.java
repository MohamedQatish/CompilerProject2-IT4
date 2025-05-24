package AST;

import java.util.ArrayList;
import java.util.List;

public class Styles {
    String style;
    String Colon;
ArrayLiteral arrayLiteral;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
        if(style!=null){
            sb.append(style);
        }
        if(Colon!=null){
            sb.append(Colon);
        }
        if(arrayLiteral!=null){
            sb.append(arrayLiteral);
        }
      return   sb.toString();
    }
}
