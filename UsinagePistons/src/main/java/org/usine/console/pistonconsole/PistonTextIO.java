package org.usine.console.pistonconsole;

import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

public class PistonTextIO {

    private final TextIO textIO;

    public PistonTextIO() {
        this.textIO = TextIoFactory.getTextIO();
    }

    public void terminateProgram() {
        textIO.newStringInputReader()
                .withMinLength(0)
                .withPropertiesPrefix("custom.neutral")
                .read("\nPress enter to terminate...");
        textIO.dispose();
    }

    public TextIO textIO() {
        return textIO;
    }
}
