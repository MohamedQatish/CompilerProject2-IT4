package AST;

public class Standalone {
    String standalone;
    String Colon ;
    boolean booleanvalue;

    public String getStandalone() {
        return standalone;
    }

    public void setStandalone(String standalone) {
        this.standalone = standalone;
    }

    public String getColon() {
        return Colon;
    }

    public void setColon(String colon) {
        Colon = colon;
    }

    public boolean isBooleanvalue() {
        return booleanvalue;
    }

    public void setBooleanvalue(boolean booleanvalue) {
        this.booleanvalue = booleanvalue;
    }

    @Override
    public String toString() {
  StringBuilder sb=new StringBuilder();

  if(standalone!=null){
      sb.append(standalone);
  }
        if(Colon!=null){
            sb.append(Colon);
        }
            sb.append("{boolean value}=").append(booleanvalue).append("}");

  return sb.toString();
    }
}
