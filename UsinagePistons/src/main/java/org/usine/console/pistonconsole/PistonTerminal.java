package org.usine.console.pistonconsole;

import org.beryx.textio.swing.SwingTextTerminal;

import static java.awt.Color.RED;
import static java.awt.Color.green;

public class PistonTerminal {

    private final SwingTextTerminal terminal;

    private final PistonTextIO pistonTextIO;

    public PistonTerminal() {
        this.pistonTextIO = new PistonTextIO();
        this.terminal = (SwingTextTerminal)pistonTextIO.textIO().getTextTerminal();
    }

    public void terminalColorForFirstMenu() {
        terminal.getProperties().setPromptColor(RED);
        terminal.setPromptFontFamily("arial");
        terminal.println("################################");
        terminal.println("# USINE PISTONS SIMULATOR #");
        terminal.println("################################");
        terminal.println("\n");
        terminal.getProperties().setPromptColor(green);
        terminal.setPromptFontFamily("times");
    }
    public void countDown() {
        terminal.setBookmark("COUNTDOWN");
        terminal.println("Le simulateur d'usine de pistons s'ouvre dans:");
        for(int i=5; i>=0; i--) {
            terminal.resetLine();
            delay(500);
            terminal.print("      " + i);
            delay(500);
        }
        terminal.resetToBookmark("COUNTDOWN");
    }
    public static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //GETTER
    public SwingTextTerminal terminal() {
        return terminal;
    }
}
