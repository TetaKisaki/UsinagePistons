package org.usine.console;

import org.usine.usinage.TypeOfUsinagePistons;

import org.usine.console.pistonconsole.PistonTerminal;

import static java.awt.Color.blue;
import static java.awt.Color.green;

public class InformationUsinage {

    private final PistonTerminal pistonTerminal;

    public InformationUsinage() {
        pistonTerminal = new PistonTerminal();
    }

    public void pistonsGeneres(int pistons, double temps) {
        pistonTerminal.terminal().getProperties().setPromptColor(blue);
        pistonTerminal.terminal().println("Il vous a fallu " + temps + "s pour générer " + pistons  + " piston(s).");
        pistonTerminal.terminal().getProperties().setPromptColor(green);
    }
    public void detailsduPistonsGeneres(TypeOfUsinagePistons typeOfUsinagePistons, int tailleCarton, int nombreAxe, int nombreJupe, int nombretete) {
        pistonTerminal.terminal().getProperties().setPromptColor(blue);
        pistonTerminal.terminal().println("La méthode utilisée pour usiner était celle en " + typeOfUsinagePistons.name());

        pistonTerminal.terminal().println("La taille du carton était: " + tailleCarton);
        pistonTerminal.terminal().println("Le nombre d'Axes dans le carton était de: " + nombreAxe);
        pistonTerminal.terminal().println("Le nombre de Jupes dans le carton était de: " + nombreJupe);
        pistonTerminal.terminal().println("Le nombre de têtes dans le carton était de: " + nombretete);
    }
}
