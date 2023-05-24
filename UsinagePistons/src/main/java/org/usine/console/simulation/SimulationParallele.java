package org.usine.console.simulation;

import org.usine.usinage.TypeOfUsinagePistons;

public class SimulationParallele implements Simulation {


    public void informationUsinage() {
        double tempsUsinageCarton = usine.usinerCartonEnParallele(CARTON_PAR_DEFAUT);
        int nombreDePistonsGeneres = usine.getNombreDePistonsGeneres();
        informationsUsinage.pistonsGeneres(nombreDePistonsGeneres,tempsUsinageCarton);
    }

    public void detailsUsinage() {
        int tailleCarton = CARTON_PAR_DEFAUT.getTailleCarton();
        int nombreAxes = CARTON_PAR_DEFAUT.getNombreAxes();
        int nombreJupes = CARTON_PAR_DEFAUT.getNombreJupes();
        int nombreTetes = CARTON_PAR_DEFAUT.getNombreTetes();

        informationsUsinage.detailsduPistonsGeneres(TypeOfUsinagePistons.PARALLELE,tailleCarton,nombreAxes,nombreJupes,nombreTetes);
    }
}
