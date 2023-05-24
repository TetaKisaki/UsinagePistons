package org.usine.duree.panne;

import java.util.Random;

public class PannePiece {

    Boolean[] enPanne = {false,false,false,true};
    Random random = new Random();
    public boolean machineEnPanne() {
        int chancePanne = random.nextInt(enPanne.length);

        return enPanne[chancePanne];
    }
}