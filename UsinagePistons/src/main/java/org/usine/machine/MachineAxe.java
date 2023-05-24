package org.usine.machine;

import org.usine.duree.usinage.TempsUsinageAxe;
import org.usine.piece.Piece;

public class MachineAxe implements Machine{

    TempsUsinageAxe tempsUsinageAxe = new TempsUsinageAxe();
    private double dureeFinaleUsinageAxe = 0;
    @Override
    public double tempsUsinage() {
        if (pannePiece.machineEnPanne()) {
            this.dureeFinaleUsinageAxe += reparationPiece.reparationPiece();
        }
        this.dureeFinaleUsinageAxe += tempsUsinageAxe.traitementPiece();

        return this.dureeFinaleUsinageAxe;
    }

    @Override
    public void usiner(Piece piece) {
        this.dureeFinaleUsinageAxe = tempsUsinage();
        piece.passerEnUsine(this.dureeFinaleUsinageAxe);
    }
}
