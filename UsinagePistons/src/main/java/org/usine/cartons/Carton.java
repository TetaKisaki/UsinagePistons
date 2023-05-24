package org.usine.cartons;
import org.usine.exceptions.PieceInconnueException;
import org.usine.piece.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carton {
    private static final Random random = new Random();
    private static final int MINUMUM_RANDOM_BOX_SIZE  = 100;
    private static final int MAXIMUM_RANDOM_BOX_SIZE  = 1000;
    private final int tailleCarton;
    private int nombreAxe;
    private int nombreTetes;
    private int nombreJupes;

    public int getTailleCarton() {
        return tailleCarton;
    }

    public int getNombreAxes() {
        return nombreAxe;
    }

    public int getNombreTetes() {
        return nombreTetes;
    }

    public int getNombreJupes() {
        return nombreJupes;
    }
    private final List<Piece> pieces;

    public List<Piece> pieces() {
        return pieces;
    }

    public Carton() {
        this.tailleCarton = random.nextInt(MINUMUM_RANDOM_BOX_SIZE, MAXIMUM_RANDOM_BOX_SIZE);
        this.pieces = new ArrayList<>(this.tailleCarton);
    }

    public Carton(List<Piece> pieces) {
        this.tailleCarton = pieces.size();
        this.pieces = pieces;
    }
    public void getEachPieces(int nombreAxe, int nombreJupes, int nombreTetes){
        this.nombreAxe = nombreAxe;
        this.nombreJupes = nombreJupes;
        this.nombreTetes = nombreTetes;
    }

    public static Carton cartonParDefaut() {
        int tailleCarton = random.nextInt(MINUMUM_RANDOM_BOX_SIZE, MAXIMUM_RANDOM_BOX_SIZE);

        List<Piece> pieceAxe = randomPiece(KeyPiece.AXE, tailleCarton);
        int tailleDisponible = tailleCarton - pieceAxe.size();
        List<Piece> pieceJupe = randomPiece(KeyPiece.JUPE, tailleDisponible);
        tailleDisponible = tailleDisponible - pieceJupe.size();
        List<Piece> pieceTete = randomPiece(KeyPiece.TETE, tailleDisponible);

        ArrayList<Piece> pieces = new ArrayList<>(pieceAxe);
        pieces.addAll(pieceJupe);
        pieces.addAll(pieceTete);
        Carton carton = new Carton(pieces);
        carton.getEachPieces(pieceAxe.size(),pieceJupe.size(),pieceTete.size());
        return carton;
    } 
    public static Carton cartonPredefini(int tailleCarton) {
        List<Piece> pieceAxe = randomPiece(KeyPiece.AXE, tailleCarton);
        int tailleDisponible = tailleCarton - pieceAxe.size();
        List<Piece> pieceJupe = randomPiece(KeyPiece.JUPE, tailleDisponible);
        tailleDisponible = tailleDisponible - pieceJupe.size();
        List<Piece> pieceTete = randomPiece(KeyPiece.TETE, tailleDisponible);

        ArrayList<Piece> pieces = new ArrayList<>(pieceAxe);
        pieces.addAll(pieceJupe);
        pieces.addAll(pieceTete);
        Carton carton = new Carton(pieces);
        carton.getEachPieces(pieceAxe.size(),pieceJupe.size(),pieceTete.size());
        return carton;
    }

    public static List<Piece> randomPiece(KeyPiece keyPiece,int tailleDisponible) {
        Random random = new Random();
        int taille = random.nextInt(tailleDisponible);
        List<Piece> pieces = new ArrayList<>();
        for (int i = 0; i < taille; i++) {
            rangementPieces(keyPiece, pieces);
        }
        return pieces;
    }

    private static void rangementPieces(KeyPiece keyPiece, List<Piece> pieces) {
        switch (keyPiece) {
            case TETE -> pieces.add(new Tete());
            case AXE -> pieces.add(new Axe());
            case JUPE -> pieces.add(new Jupe());
            default -> throw new PieceInconnueException();
        }
    }
}
