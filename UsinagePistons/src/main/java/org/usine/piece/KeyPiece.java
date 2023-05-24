package org.usine.piece;

public enum KeyPiece {
    AXE(2.5),
    JUPE(3),
    TETE(2);

    private final double tempsUsinagePiece;

    KeyPiece(double tempsUsinagePiece) {
        this.tempsUsinagePiece = tempsUsinagePiece;
    }

    public double tempsUsinagePiece() {
        return tempsUsinagePiece;
    }
}
