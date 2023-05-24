package org.usine.machine;

import org.usine.duree.usinage.TempsUsinageMachinePrincipale;
import org.usine.exceptions.UsinageImpossibleException;
import org.usine.piece.Piece;

public class MachinePrincipale implements Machine{

    TempsUsinageMachinePrincipale tempsUsinageMachinePrincipale = new TempsUsinageMachinePrincipale();
    private double dureeFinaleUsinageMachinePrincipale = 0;
    @Override
    public double tempsUsinage() {
        if (pannePiece.machineEnPanne()) {
            this.dureeFinaleUsinageMachinePrincipale += reparationPiece.reparationPiece();
        }
        this.dureeFinaleUsinageMachinePrincipale += tempsUsinageMachinePrincipale.traitementPiece();

        return this.dureeFinaleUsinageMachinePrincipale;
    }

    @Override
    public void usiner(Piece piece) {
        throw new UsinageImpossibleException();
    }

    public double tempsUsinagePiecesEnChaine(Piece axe, Piece jupe, Piece tete) {
        return axe.delaisUsinage() + jupe.delaisUsinage() + tete.delaisUsinage();
    }

    public double tempsUsinagePiecesEnParralele(Piece axe, Piece jupe, Piece tete) {
        double delaisUsinageAxe = axe.delaisUsinage();
        double delaisUsinageJupe = jupe.delaisUsinage();
        double delaisUsinageTete = tete.delaisUsinage();

        return Math.max(delaisUsinageAxe, Math.max(delaisUsinageJupe, delaisUsinageTete));
    }
}
