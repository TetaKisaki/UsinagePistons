package org.usine.usinage;

import org.usine.cartons.Carton;
import org.usine.piece.*;

import java.util.*;

public class Triage {
    public Map<KeyPiece, Collection<Piece>> tri(Carton carton) {
        List<Piece> pieces = carton.pieces();

        List<Piece> axes = new ArrayList<>();
        List<Piece> jupes = new ArrayList<>();
        List<Piece> tetes = new ArrayList<>();

        trierChaquePiece(pieces, axes, jupes, tetes);

        Map<KeyPiece, Collection<Piece>> dictionnaire = new HashMap<>();
        dictionnaire.put(KeyPiece.AXE,axes);
        dictionnaire.put(KeyPiece.JUPE,jupes);
        dictionnaire.put(KeyPiece.TETE,tetes);
        return dictionnaire;
    }

    private void trierChaquePiece(List<Piece> pieces, List<Piece> axes, List<Piece> jupes, List<Piece> tetes) {
        for (Piece piece: pieces) {
            conditionDeTri(axes, jupes, tetes, piece);
        }
    }

    private  void conditionDeTri(List<Piece> axes, List<Piece> jupes, List<Piece> tetes, Piece piece) {
        if (piece instanceof Axe) {
            axes.add(piece);
        } else if (piece instanceof Jupe) {
            jupes.add(piece);
        } else if (piece instanceof Tete) {
            tetes.add(piece);
        }
    }
}
