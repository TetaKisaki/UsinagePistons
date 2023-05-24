package org.usine.duree.usinage;

public class TempsUsinageMachinePrincipale implements TempsUsinage{

    private final int dureeTraitementPiece = 1;
    @Override
    public double traitementPiece() {
        return this.dureeTraitementPiece;
    }
}
