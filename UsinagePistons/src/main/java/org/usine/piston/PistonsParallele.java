package org.usine.piston;

import org.usine.exceptions.UsinageEchecException;
import org.usine.machine.MachinePrincipale;
import org.usine.piece.*;

public class PistonsParallele extends Piston{

    private final MachinePrincipale machinePrincipale = new MachinePrincipale();
    public Piston monterPistonsEnParallele(Axe axe, Jupe jupe, Tete tete) {
        if (estUsinee(axe, jupe, tete)) {
            double delaisUsinageGlobal = machinePrincipale.tempsUsinage() + machinePrincipale.tempsUsinagePiecesEnParralele(axe, jupe, tete);
            return new Piston(axe, jupe, tete, delaisUsinageGlobal);
        } else {
            throw new UsinageEchecException();
        }
    }
}
