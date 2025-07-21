package teddy.kata_tondeuse.object;


import org.junit.Test;

import static org.junit.Assert.*;

public class LawnTest {

    @Test
    public void testConstructor() {
        Lawn lawn = new Lawn(5, 5);
        // Vérifie que l'objet est créé sans erreur
        assertNotNull(lawn);
    }

    @Test
    public void testIsWithinBounds() {
        Lawn lawn = new Lawn(5, 5);

        // Teste une position dans les limites
        assertTrue(lawn.isWithinBounds(3, 4));

        // Teste une position en dehors des limites (x trop grand)
        assertFalse(lawn.isWithinBounds(6, 4));

        // Teste une position en dehors des limites (y trop grand)
        assertFalse(lawn.isWithinBounds(3, 6));

        // Teste une position en dehors des limites (x négatif)
        assertFalse(lawn.isWithinBounds(-1, 4));

        // Teste une position en dehors des limites (y négatif)
        assertFalse(lawn.isWithinBounds(3, -1));
    }
}

