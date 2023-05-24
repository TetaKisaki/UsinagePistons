package org.usine.piece;

public interface Piece {
    void passerEnUsine(double tempsUsinage);

    boolean estUsine();

    double delaisUsinage();
}
