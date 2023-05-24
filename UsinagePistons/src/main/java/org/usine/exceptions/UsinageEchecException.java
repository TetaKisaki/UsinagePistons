package org.usine.exceptions;

public class UsinageEchecException extends RuntimeException {

    public UsinageEchecException() {
        super("L'usinage a échoué");
    }
}
