package AST;

import ANTLR.AngularParser;

public class StyleContent {

    String className;
    ObjectLiteral objectLiteral;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }


    @Override
    public String toString() {
     StringBuilder sb=new StringBuilder();
     sb.append("{class Css }").append("\n");

        if(className!=null){
            sb.append("{class name}").append(className);
        }
        if(objectLiteral!=null){
            sb.append(objectLiteral);
        }

     return sb.toString();
    }
}
