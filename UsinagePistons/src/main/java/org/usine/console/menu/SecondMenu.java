package org.usine.console.menu;

import org.usine.usinage.TypeOfUsinagePistons;

import org.usine.console.pistonconsole.PistonTerminal;
import org.usine.console.pistonconsole.PistonTextIO;
import org.usine.console.simulation.Simulation;
import org.usine.console.simulation.SimulationEnChaine;
import org.usine.console.simulation.SimulationParallele;


public class SecondMenu {

    private final PistonTextIO pistonTextIO;
    private final PistonTerminal pistonTerminal;
    private final Simulation simulationEnChaine;
    private final Simulation simulationEnParallele;
    private TypeOfUsinagePistons typeOfUsinagePistons;
    private ThirthMenu thirthMenu;
    public SecondMenu() {
        pistonTextIO = new PistonTextIO();
        pistonTerminal = new PistonTerminal();
        simulationEnChaine = new SimulationEnChaine();
        simulationEnParallele = new SimulationParallele();
        thirthMenu = new ThirthMenu();
    }
    public void showMenu() {
        int choice = choiceDoneForMenuParalleleOuChaine();
        caseToDOForParalleleOrChain(choice);
    }
    private int choiceDoneForMenuParalleleOuChaine() {

        pistonTerminal.terminal().setBookmark("Second Menu");

        pistonTerminal.terminal().println("1- Simuler l'usinage en chaine");
        pistonTerminal.terminal().println("2- Simuler l'usinage en parallèle");

        return pistonTextIO.textIO().newIntInputReader()
                .withMaxVal(2)
                .read("Enter a choice");
    }

    private void caseToDOForParalleleOrChain(int choice) {
        switch (choice) {
            case 1 -> {
                simulationEnChaine.informationUsinage();
                typeOfUsinagePistons = TypeOfUsinagePistons.EN_CHAINE;
                thirthMenu.showMenuAfterSimulation();
            }
            case 2 -> {
                simulationEnParallele.informationUsinage();
                typeOfUsinagePistons = TypeOfUsinagePistons.PARALLELE;
                thirthMenu.showMenuAfterSimulation();
            }
            default -> pistonTerminal.terminal().println ("Choix invalide");
        }
    }
}
