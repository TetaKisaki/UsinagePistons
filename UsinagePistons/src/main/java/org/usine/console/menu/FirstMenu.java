package org.usine.console.menu;

import org.usine.console.pistonconsole.PistonTerminal;
import org.usine.console.pistonconsole.PistonTextIO;

import java.io.IOException;

public class FirstMenu {

    private final PistonTerminal pistonTerminal;
    private final PistonTextIO pistonTextIO;
    private final SecondMenu secondMenu;

    public FirstMenu() {
        pistonTextIO = new PistonTextIO();
        pistonTerminal = new PistonTerminal();
        secondMenu = new SecondMenu();
    }

    public void showMenu() throws IOException {
        pistonTerminal.countDown();
        int choice = choiceDoneForFirstMenu();

        pistonTerminal.terminal().resetToBookmark("First Menu");

        caseToDO(choice);
    }

    private int choiceDoneForFirstMenu() {
        pistonTerminal.terminal().setBookmark("First Menu");

        pistonTerminal.terminal().println("1- Faire une simulation d'usinage");
        pistonTerminal.terminal().println("2- Sortir");

        return pistonTextIO.textIO().newIntInputReader()
                .withMaxVal(3)
                .read("Enter a choice");
    }
    private void caseToDO(int choice) throws IOException {
        switch (choice) {
            case 1 -> secondMenu.showMenu();
            case 2 -> System.exit (0);
            default -> pistonTerminal.terminal().println ("Choix invalide");
        }
    }
}
