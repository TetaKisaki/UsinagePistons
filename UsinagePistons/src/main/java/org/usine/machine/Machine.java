package org.usine.machine;

import org.usine.duree.panne.PannePiece;
import org.usine.duree.reparation.ReparationPiece;
import org.usine.piece.Piece;

public interface Machine {

    PannePiece pannePiece = new PannePiece();
    ReparationPiece reparationPiece = new ReparationPiece();
    double tempsUsinage();

    void usiner(Piece piece);
}
