package pt.up.fe.specs.fortran.ast.nodes.program;

import org.suikasoft.jOptions.Interfaces.DataStore;
import pt.up.fe.specs.fortran.ast.nodes.FortranNode;

import java.util.Collection;

/**
 *
 */
public abstract class ProgramUnit extends FortranNode {
    public ProgramUnit(DataStore data, Collection<? extends FortranNode> children) {
        super(data, children);
    }
}
