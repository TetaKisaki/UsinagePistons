package org.usine.machine;

import org.usine.duree.usinage.TempsUsinageJupe;
import org.usine.piece.Piece;

public class MachineJupe implements Machine {
    TempsUsinageJupe tempsUsinageJupe = new TempsUsinageJupe();
    private double dureeFinaleUsinageJupe = 0;
    @Override
    public double tempsUsinage() {
        if (pannePiece.machineEnPanne()) {
            this.dureeFinaleUsinageJupe += reparationPiece.reparationPiece();
        }
        this.dureeFinaleUsinageJupe += tempsUsinageJupe.traitementPiece();

        return this.dureeFinaleUsinageJupe;
    }

    @Override
    public void usiner(Piece piece) {
        this.dureeFinaleUsinageJupe = tempsUsinage();
        piece.passerEnUsine(this.dureeFinaleUsinageJupe);
    }
}
