package teddy.kata_tondeuse.enums;




import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OrientationTest {

    // Teste la rotation à droite pour chaque orientation
    @Test
    public void testRotateRight() {
        assertEquals(Orientation.E, Orientation.N.rotate('D')); // Nord vers Est
        assertEquals(Orientation.S, Orientation.E.rotate('D')); // Est vers Sud
        assertEquals(Orientation.W, Orientation.S.rotate('D')); // Sud vers Ouest
        assertEquals(Orientation.N, Orientation.W.rotate('D')); // Ouest vers Nord
    }

    // Teste la rotation à gauche pour chaque orientation
    @Test
    public void testRotateLeft() {
        assertEquals(Orientation.W, Orientation.N.rotate('G')); // Nord vers Ouest
        assertEquals(Orientation.N, Orientation.E.rotate('G')); // Est vers Nord
        assertEquals(Orientation.E, Orientation.S.rotate('G')); // Sud vers Est
        assertEquals(Orientation.S, Orientation.W.rotate('G')); // Ouest vers Sud
    }
}
