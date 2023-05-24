package org.usine.machine;

import org.usine.duree.usinage.TempsUsinageTete;
import org.usine.piece.Piece;

public class MachineTete implements Machine {

    TempsUsinageTete tempsUsinageTete = new TempsUsinageTete();
    private double dureeFinaleUsinageTete = 0;
    @Override
    public double tempsUsinage() {
        if (pannePiece.machineEnPanne()) {
            this.dureeFinaleUsinageTete += reparationPiece.reparationPiece();
        }
        this.dureeFinaleUsinageTete += tempsUsinageTete.traitementPiece();

        return this.dureeFinaleUsinageTete;
    }

    @Override
    public void usiner(Piece piece) {
        this.dureeFinaleUsinageTete = tempsUsinage();
        piece.passerEnUsine(this.dureeFinaleUsinageTete);
    }
}
