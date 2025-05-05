package pt.up.fe.specs.fortran.ast.nodes.stmt;

import org.suikasoft.jOptions.Interfaces.DataStore;
import pt.up.fe.specs.fortran.ast.FortranKeyword;
import pt.up.fe.specs.fortran.ast.nodes.FortranNode;
import pt.up.fe.specs.fortran.ast.nodes.utils.Format;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * R1212 print-stmt
 */
public class PrintStmt extends ActionStmt {

    public PrintStmt(DataStore data, Collection<? extends FortranNode> children) {
        super(data, children);
    }

    public Format getFormat() {
        return getChild(Format.class, 0);
    }

    public List<FortranNode> getOutputItems() {
        return getChildren().subList(1, getNumChildren());
    }

    @Override
    public String getCode() {
        var code = new StringBuilder();
        code.append(keyword(FortranKeyword.PRINT));
        code.append(" ").append(getFormat().getCode());

        var outputItems = getOutputItems();
        if (!outputItems.isEmpty()) {
            var itemsCode = outputItems.stream()
                    .map(FortranNode::getCode)
                    .collect(Collectors.joining(", ", ", ", ""));
            code.append(itemsCode);
        }


        return code.toString();
    }
}
