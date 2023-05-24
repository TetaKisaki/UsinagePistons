package org.usine.console.simulation;

import org.usine.usinage.Usinage;
import org.usine.cartons.Carton;
import org.usine.console.InformationUsinage;

public interface Simulation {

    Carton CARTON_PAR_DEFAUT = Carton.cartonParDefaut();
    Usinage usine = new Usinage();
    InformationUsinage informationsUsinage =  new InformationUsinage();

    void informationUsinage();
    void detailsUsinage();
}
