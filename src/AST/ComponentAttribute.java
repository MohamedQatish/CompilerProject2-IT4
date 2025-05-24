package AST;

public class ComponentAttribute {


    Selector selector;
    Standalone standalone;
    Imports imports;
    Template template;
    Styles styles;

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public Standalone getStandalone() {
        return standalone;
    }

    public void setStandalone(Standalone standalone) {
        this.standalone = standalone;
    }

    public Imports getImports() {
        return imports;
    }

    public void setImports(Imports imports) {
        this.imports = imports;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Styles getStyles() {
        return styles;
    }

    public void setStyles(Styles styles) {
        this.styles = styles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentAttributes {");
        if (selector != null)
            sb.append("selectorDeclaration ={").append(selector);
        if (imports != null)
            sb.append("importsDeclaration= {").append(imports);
        if (standalone != null)
            sb.append("StandaloneDeclaration= {").append(standalone);
        if (template != null)
            sb.append("templateDeclaration ={").append(template);
        sb.append("}");
        if (styles != null)
            sb.append("Style Declaration ={").append(styles);
        sb.append("}");
        return sb.toString();
    }
}



