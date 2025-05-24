package AST;

public class
LiteralExpression {
     String NullLiteral;
    boolean BooleanLiteral;
    String StringLiteral;
    double DecimalLiteral ;

    public boolean isBooleanLiteral() {
        return BooleanLiteral;
    }

    public String getNullLiteral() {
        return NullLiteral;
    }


    public String getStringLiteral() {
        return StringLiteral;
    }

    public double getDecimalLiteral() {
        return DecimalLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        NullLiteral = nullLiteral;
    }

    public void setBooleanLiteral(boolean booleanLiteral) {
        BooleanLiteral = booleanLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public void setDecimalLiteral(double decimalLiteral) {
        DecimalLiteral = decimalLiteral;
    }

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    if (NullLiteral != null)
        sb.append(NullLiteral).append(" { NullLiteral } ");

    else if (StringLiteral != null)
        sb.append(StringLiteral).append(" { StringLiteral } ");
    else if (BooleanLiteral)
        sb.append(BooleanLiteral).append(" { BooleanLiteral } ");
    else
        sb.append(DecimalLiteral).append(" { DecimalLiteral } ");
    return sb.toString();
}
}
