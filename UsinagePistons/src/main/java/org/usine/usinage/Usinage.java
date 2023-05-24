package org.usine.usinage;

import org.usine.cartons.Carton;
import org.usine.cartons.CartonsUsines;
import org.usine.cartons.CartonsUsinesEnChaine;
import org.usine.cartons.CartonsUsinesEnParallele;
import org.usine.piston.CreerPistons;
import org.usine.piston.Piston;

import java.util.ArrayList;
import java.util.List;
public class Usinage {
    private final CreerPistons creerPistons;
    private final List<CartonsUsines> cartonsUsines;

    public int getNombreDePistonsGeneres() {
        return nombreDePistonsGeneres;
    }

    private int nombreDePistonsGeneres;

    public Usinage() {
        this.cartonsUsines = new ArrayList<>();
        creerPistons = new CreerPistons();
    }

    public double usinerCartonEnChaine(Carton carton) {

        List<Piston> pistons = creerPistons.getPistons(carton, TypeOfUsinagePistons.EN_CHAINE);
        double tempsMaximalPour100Pistons = 0.0;
        for (Piston piston : pistons) {
            tempsMaximalPour100Pistons += piston.delaisAssemblage();
        }
        CartonsUsinesEnChaine cartonUsine = new CartonsUsinesEnChaine(carton, tempsMaximalPour100Pistons);
        this.cartonsUsines.add(cartonUsine);
        this.nombreDePistonsGeneres = pistons.size();
        return tempsMaximalPour100Pistons;
    }

    public double usinerCartonEnParallele(Carton carton) {
        List<Piston> pistons = creerPistons.getPistons(carton, TypeOfUsinagePistons.PARALLELE);
        double tempsMaximalPour100PistonsEnParallele = 0.0;
        for (Piston piston : pistons) {
            tempsMaximalPour100PistonsEnParallele += piston.delaisAssemblage();
        }

        CartonsUsinesEnParallele cartonUsine = new CartonsUsinesEnParallele(carton,
                tempsMaximalPour100PistonsEnParallele);
        this.cartonsUsines.add(cartonUsine);
        this.nombreDePistonsGeneres = pistons.size();
        return tempsMaximalPour100PistonsEnParallele;
    }
}
