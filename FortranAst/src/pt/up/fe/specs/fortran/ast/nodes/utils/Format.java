package pt.up.fe.specs.fortran.ast.nodes.utils;

import org.suikasoft.jOptions.Interfaces.DataStore;
import pt.up.fe.specs.fortran.ast.nodes.FortranNode;

import java.util.Collection;

/**
 * R1215 format
 */
public abstract class Format extends FortranNode {

    public Format(DataStore data, Collection<? extends FortranNode> children) {
        super(data, children);
    }
}
