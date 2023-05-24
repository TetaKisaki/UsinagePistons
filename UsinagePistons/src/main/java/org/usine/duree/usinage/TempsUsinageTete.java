package org.usine.duree.usinage;

import org.usine.piece.KeyPiece;

public class TempsUsinageTete implements TempsUsinage{
    private double dureeUsinagePiece;
    @Override
    public double traitementPiece() {
        this.dureeUsinagePiece = KeyPiece.TETE.tempsUsinagePiece();
        return this.dureeUsinagePiece;
    }
}
