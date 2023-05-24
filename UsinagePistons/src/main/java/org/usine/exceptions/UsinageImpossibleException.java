package org.usine.exceptions;

public class UsinageImpossibleException extends RuntimeException {

    public UsinageImpossibleException() {
        super("Impossible d'usiner cette partie");
    }
}
