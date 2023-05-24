package org.usine.exceptions;

public class PieceInconnueException extends RuntimeException {
    public PieceInconnueException() {
        super("\"Unexpected value: \" + keyPiece");
    }
}
