package org.usine;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.usine.dependance.PistonEditor;
import org.usine.dependance.PistonModule;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Injector injector = Guice.createInjector(new PistonModule());
        PistonEditor pistonEditor = injector.getInstance(PistonEditor.class);
        pistonEditor.launchApplication();
    }
}