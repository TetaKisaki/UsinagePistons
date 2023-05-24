package org.usine.console.menu;

import org.usine.usinage.TypeOfUsinagePistons;
import org.usine.console.pistonconsole.PistonTerminal;
import org.usine.console.pistonconsole.PistonTextIO;
import org.usine.console.simulation.Simulation;
import org.usine.console.simulation.SimulationEnChaine;
import org.usine.console.simulation.SimulationParallele;

public class ThirthMenu {

    private final PistonTextIO pistonTextIO;
    private final PistonTerminal pistonTerminal;
    private final Simulation simulationEnChaine;
    private final Simulation simulationEnParallele;
    private TypeOfUsinagePistons typeOfUsinagePistons;
    public ThirthMenu() {
        pistonTextIO = new PistonTextIO();
        pistonTerminal = new PistonTerminal();
        simulationEnChaine = new SimulationEnChaine();
        simulationEnParallele = new SimulationParallele();
    }
    public void showMenuAfterSimulation() {
        int choice = choiceDoneForMenuAfterSimulation();
        caseToDOForMenuAfterSimulation(choice);
    }
    private int choiceDoneForMenuAfterSimulation() {

        pistonTerminal.terminal().println("1- Voir les détails");
        pistonTerminal.terminal().println("2- Sortir");

        return pistonTextIO.textIO().newIntInputReader()
                .withMaxVal(2)
                .read("Enter a choice");
    }
    private void caseToDOForMenuAfterSimulation(int choice) {
        pistonTerminal.terminal().resetToBookmark("Second Menu");
        switch (choice) {
            case 1 ->{
                if (typeOfUsinagePistons == TypeOfUsinagePistons.EN_CHAINE) {
                    simulationEnChaine.detailsUsinage();
                    pistonTextIO.terminateProgram();
                } else{
                    simulationEnParallele.detailsUsinage();
                    pistonTextIO.terminateProgram();
                }
            }
            case 2 -> System.exit(0);
            default -> pistonTerminal.terminal().println ("Choix invalide");
        }
    }
}
