package org.usine.dependance;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import org.usine.console.PistonsEnConsole;

public class PistonModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PistonsEnConsole.class).in(Scopes.SINGLETON);
    }
}
