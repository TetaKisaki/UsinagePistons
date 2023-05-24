package org.usine.duree.reparation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ReparationPieceTest {

    private ReparationPiece reparationPiece;

    @BeforeEach
    void setUp() {
        reparationPiece = new ReparationPiece();
    }
    @Test
    @DisplayName("Vérfier que le test donne une valeur aléatoire entre 5 et 10")
    void reparationPiece() {

        int reparationPieceTime = reparationPiece.reparationPiece();
        assertThat(reparationPieceTime).isBetween(5,10);
    }
}