package org.usine.duree.reparation;

import java.util.Random;

public class ReparationPiece {

    private final int MINIMUM_TIME_REPARATION = 5;
    private final int MAXIMUM_TIME_REPARATION = 10;
    private final Random random = new Random();
    private int tempsDeReparation = 0;

    public int reparationPiece() {
        this.tempsDeReparation = random.nextInt(MINIMUM_TIME_REPARATION, MAXIMUM_TIME_REPARATION + 1);

        return this.tempsDeReparation;
    }
}
