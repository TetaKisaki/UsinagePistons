package org.usine.dependance;

import org.usine.console.PistonsEnConsole;

import javax.inject.Inject;
import java.io.IOException;

public class PistonEditor {

    private final PistonsEnConsole pistonsEnConsole;

    @Inject
    public PistonEditor(PistonsEnConsole pistonsEnConsole) {
        this.pistonsEnConsole = pistonsEnConsole;
    }

    public void launchApplication() throws IOException {
        pistonsEnConsole.launchUsinagePistons();
    }
}
