package org.usine.cartons;

public class CartonsUsinesEnParallele implements CartonsUsines {

    Carton carton;
    double delaisUsinageCarton;
    public CartonsUsinesEnParallele(Carton carton, double delaysUsinageCartonParallel) {
        this.carton = carton;
        this.delaisUsinageCarton = delaysUsinageCartonParallel;
    }
}
