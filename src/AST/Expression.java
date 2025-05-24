package AST;

import java.util.ArrayList;
import java.util.List;

public class  Expression {
    LiteralExpression literalExpression ;
    ArrayLiteral arrayLiteral ;
    ObjectLiteral objectLiteral;
    AnoymousFunction anoymousFunction;
    ReturnStatement returnStatement ;
    HtmlElementsNode htmlContentNode ;
    forStatement forStatement;
    IfStatement ifStatement ;
    String Identifier;
    String Map ;
    Expression left ;
    Expression right ;
    Expression cond ;
    MustachExpression mustache;
    StyleContent styleContent;
    PlusPlusExpression plusPlusExpression;
    FunctionDeclaration functionDeclaration;
   IndexArray indexArray;

    public IndexArray getIndexArray() {
        return indexArray;
    }

    public void setIndexArray(IndexArray indexArray) {
        this.indexArray = indexArray;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public StyleContent getStyleContent() {
        return styleContent;
    }

    public void setStyleContent(StyleContent styleContent) {
        this.styleContent = styleContent;
    }

    public MustachExpression getMustache() {
        return mustache;
    }

    public void setMustache(MustachExpression mustache) {
        this.mustache = mustache;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public HtmlElementsNode getHtmlContentNode() {
        return htmlContentNode;
    }

    public void setHtmlContentNode(HtmlElementsNode htmlContentNode) {
        this.htmlContentNode = htmlContentNode;
    }



    HtmlElementsNode htmlElementsNode ;

    List<Expression> ls= new ArrayList<Expression>();

    public Expression getCond() {
        return cond;
    }

    public void setCond(Expression cond) {
        this.cond = cond;
    }

    public List<Expression> getLs() {
        return ls;
    }

    public void setLs(List<Expression> ls) {
        this.ls = ls;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getMap() {
        return Map;
    }

    public void setMap(String map) {
        Map = map;
    }

    public AST.forStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(AST.forStatement forStatement) {
        this.forStatement = forStatement;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }
    public HtmlElementsNode getHtmlElementsNode() {
        return htmlElementsNode;
    }

    public void setHtmlElementsNode(HtmlElementsNode htmlElementsNode) {
        this.htmlElementsNode = htmlElementsNode;
    }




    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public PlusPlusExpression getPlusPlusExpression() {
        return plusPlusExpression;
    }

    public void setPlusPlusExpression(PlusPlusExpression plusPlusExpression) {
        this.plusPlusExpression = plusPlusExpression;
    }

    public AnoymousFunction getAnoymousFunction() {
        return anoymousFunction;
    }

    public void setAnoymousFunction(AnoymousFunction anoymousFunction) {
        this.anoymousFunction = anoymousFunction;
    }

    public LiteralExpression getLiteralExpression() {
        return literalExpression;
    }

    public void setLiteralExpression(LiteralExpression literalExpression) {
        this.literalExpression = literalExpression;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (literalExpression != null) {
            sb.append(literalExpression);
        }

        if (arrayLiteral != null) {
            sb.append(arrayLiteral);
        }

        if (objectLiteral != null) {
            sb.append(objectLiteral);
        }

        if (anoymousFunction != null) {
            sb.append(anoymousFunction);
        }



        if (returnStatement != null) {
            sb.append(returnStatement);
        }


        if (left !=null){
            sb.append(left);
        }
        if (right !=null){
            sb.append(right);
        }

        if (htmlElementsNode != null) {
            sb.append(htmlElementsNode);
        }
        if (htmlContentNode != null) {
            sb.append(htmlContentNode);
        }
        if (Identifier != null) {
            sb.append(Identifier).append(" { Identifier } ");
        }

        if (Map != null) {
            sb.append(Map).append(" { Map } ");
        }
        if (cond != null) {
            sb.append(cond).append(" { cond } ");
        }
        if (forStatement != null) {
            sb.append(forStatement);
        }

        if (ifStatement != null) {
            sb.append(ifStatement);
        }
        if (mustache != null) {

            sb.append(mustache);
        }
        if (styleContent != null) {

            sb.append(styleContent);
        }

        if (plusPlusExpression != null) {

            sb.append(plusPlusExpression);
        }
        if (functionDeclaration != null) {
            sb.append(" functionDeclaration=").append(functionDeclaration).append('\n');
        }
        if (indexArray != null) {
            sb.append(indexArray).append('\n');
        }
        return sb.toString();
    }
}

