package org.usine.piston;

import org.usine.piece.*;

public class Piston {
    private final Axe axe;
    private final Jupe jupe;
    private final Tete tete;
    private double delaisAssemblage;

    public Piston() {
        axe = new Axe();
        jupe = new Jupe();
        tete = new Tete();
    }

    public Piston(Axe axe, Jupe jupe, Tete tete, double delaisAssemblage) {
        this.axe = axe;
        this.jupe = jupe;
        this.tete = tete;
        this.delaisAssemblage = delaisAssemblage;
    }

    public double delaisAssemblage() {
        return delaisAssemblage;
    }

    protected boolean estUsinee(Axe axe, Jupe jupe, Tete tete) {
        return axe.estUsine() && jupe.estUsine() && tete.estUsine();
    }
}
