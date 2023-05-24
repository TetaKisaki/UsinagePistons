package org.usine.duree.usinage;

import org.usine.piece.KeyPiece;

public class TempsUsinageJupe implements TempsUsinage{

    private double dureeUsinagePiece;
    @Override
    public double traitementPiece() {
        this.dureeUsinagePiece = KeyPiece.JUPE.tempsUsinagePiece();
        return this.dureeUsinagePiece;
    }
}
