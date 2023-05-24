package org.usine.piece;

public class Tete implements Piece {
    private boolean estUsine;
    private double delaisUsinage;
    @Override
    public void passerEnUsine(double tempsUsinage) {
        this.delaisUsinage = tempsUsinage;
        this.estUsine = true;
    }

    @Override
    public boolean estUsine() {
        return this.estUsine;
    }

    @Override
    public double delaisUsinage() {
        return this.delaisUsinage;
    }
}
