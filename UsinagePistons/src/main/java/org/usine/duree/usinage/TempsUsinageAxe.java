package org.usine.duree.usinage;

import org.usine.piece.KeyPiece;

public class TempsUsinageAxe implements TempsUsinage{

    private double dureeUsinagePiece;
    @Override
    public double traitementPiece() {
        this.dureeUsinagePiece = KeyPiece.AXE.tempsUsinagePiece();
        return this.dureeUsinagePiece;
    }
}
