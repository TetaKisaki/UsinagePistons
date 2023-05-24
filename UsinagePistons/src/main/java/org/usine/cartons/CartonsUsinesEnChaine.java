package org.usine.cartons;

public class CartonsUsinesEnChaine implements CartonsUsines {
    double delaisUsinageCartonEnChaine;
    Carton carton;
    public CartonsUsinesEnChaine(Carton carton, double delaisUsinageCartonEnChaine) {
        this.carton = carton;
        this.delaisUsinageCartonEnChaine = delaisUsinageCartonEnChaine;
    }
}
