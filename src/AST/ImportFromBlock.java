package AST;

import ANTLR.AngularParser;

public class ImportFromBlock {
    String identifier;
ModuleItems moduleItems;
String importFrom;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        identifier = identifier;
    }

    public ModuleItems getModuleItems() {
        return moduleItems;
    }

    public void setModuleItems(ModuleItems moduleItems) {
        this.moduleItems = moduleItems;
    }

    public String getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(String importFrom) {
        this.importFrom = importFrom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n'+" import " );
        if (identifier != null)
            sb.append(" identifier = ").append(identifier);
        if (moduleItems != null)
            sb.append(" moduleItems = ").append(moduleItems);
        if (importFrom != null)
            sb.append(" importFrom = ").append(importFrom);
        return sb.toString();
    }
}
