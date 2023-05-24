package org.usine.piston;

import org.usine.machine.MachinePrincipale;
import org.usine.piece.*;

public class PistonsChaine extends Piston{

    private final MachinePrincipale machinePrincipale = new MachinePrincipale();

    public Piston monterPistonEnChaine(Axe axe, Jupe jupe, Tete tete) {
        if (estUsinee(axe, jupe, tete)) {
            double delaisUsinageGlobal = machinePrincipale.tempsUsinage() + machinePrincipale.tempsUsinagePiecesEnChaine(axe, jupe, tete);
            return new Piston(axe, jupe, tete, delaisUsinageGlobal);
        } else {
            throw new RuntimeException();
        }
    }
}
