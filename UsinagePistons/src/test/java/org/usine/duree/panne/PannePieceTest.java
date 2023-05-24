package org.usine.duree.panne;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class PannePieceTest {

    PannePiece pannePiece;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pannePiece = new PannePiece();
    }

    @Test
    @Disabled
    @DisplayName("Vérifier si la chance de tomber en panne est de 1/4")
     void panneTest() {

        boolean enPanne = pannePiece.machineEnPanne();
        assertThat(enPanne).isFalse().as("3/4");
    }
}