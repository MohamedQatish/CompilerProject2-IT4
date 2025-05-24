package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration {
    String ClassName;
    Export ClassExport ;

     ClassBody classBody;

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }


    public Export getClassExport() {
        return ClassExport;
    }

    public void setClassExport(Export classExport) {
        ClassExport = classExport;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (ClassExport != null)
            sb.append(ClassExport);
        if (ClassName != null)
            sb.append(" class Name = ").append(ClassName).append('\n');


        if (classBody != null)
            sb.append(classBody);

        return sb.toString();
    }
}
