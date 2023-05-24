package org.usine.console;

import org.usine.console.menu.FirstMenu;
import org.usine.console.pistonconsole.PistonTerminal;

import java.io.IOException;

public class PistonsEnConsole {

    PistonTerminal pistonTerminal;
    FirstMenu firstMenu;

    public PistonsEnConsole() {
        pistonTerminal = new PistonTerminal();
        firstMenu = new FirstMenu();
    }

    public void launchUsinagePistons() throws IOException {
        pistonTerminal.terminalColorForFirstMenu();
        firstMenu.showMenu();
    }
}
