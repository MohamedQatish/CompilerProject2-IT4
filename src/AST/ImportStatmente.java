package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatmente {
    List<ImportFromBlock> importFromBlocks= new ArrayList<ImportFromBlock>();

    public List<ImportFromBlock> getImportFromBlocks() {
        return importFromBlocks;
    }

    public void setImportFromBlocks(List<ImportFromBlock> importFromBlocks) {
        this.importFromBlocks = importFromBlocks;
    }
    @Override
    public String toString() {
        return
                " "+'\n'
                        + importFromBlocks + '\n'+" "
                ;
    }
}
