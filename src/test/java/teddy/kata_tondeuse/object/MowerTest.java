package teddy.kata_tondeuse.object;

import org.junit.Test;
import teddy.kata_tondeuse.enums.Orientation;
import static org.junit.Assert.*;

public class MowerTest {

	// Teste le constructeur et les getters de la classe Mower
	@Test
	public void testConstructorAndGetters() {
		Mower mower = new Mower(1, 2, Orientation.N);
		assertEquals(1, mower.getX());
		assertEquals(2, mower.getY());
		assertEquals(Orientation.N, mower.getOrientation());
	}

	// Teste les setters de la classe Mower pour la position (x, y)
	@Test
	public void testSetters() {
		Mower mower = new Mower(0, 0, Orientation.N);
		mower.setX(3);
		mower.setY(4);
		assertEquals(3, mower.getX());
		assertEquals(4, mower.getY());
	}

	// Teste la rotation à droite de la tondeuse
	@Test
	public void testRotateRight() {
		Mower mower = new Mower(0, 0, Orientation.N);
		mower.rotate('D');
		assertEquals(Orientation.E, mower.getOrientation());
	}

	// Teste la rotation à gauche de la tondeuse
	@Test
	public void testRotateLeft() {
		Mower mower = new Mower(0, 0, Orientation.N);
		mower.rotate('G');
		assertEquals(Orientation.W, mower.getOrientation());
	}

	// Teste le déplacement vers le nord de la tondeuse
	@Test
	public void testMoveNorth() {
		Mower mower = new Mower(0, 0, Orientation.N);
		mower.move();
		assertEquals(0, mower.getX());
		assertEquals(1, mower.getY());
	}

	// Teste le déplacement vers l'est de la tondeuse
	@Test
	public void testMoveEast() {
		Mower mower = new Mower(0, 0, Orientation.E);
		mower.move();
		assertEquals(1, mower.getX());
		assertEquals(0, mower.getY());
	}

	// Teste le déplacement vers le sud de la tondeuse
	@Test
	public void testMoveSouth() {
		Mower mower = new Mower(0, 1, Orientation.S);
		mower.move();
		assertEquals(0, mower.getX());
		assertEquals(0, mower.getY());
	}

	// Teste le déplacement vers l'ouest de la tondeuse
	@Test
	public void testMoveWest() {
		Mower mower = new Mower(1, 0, Orientation.W);
		mower.move();
		assertEquals(0, mower.getX());
		assertEquals(0, mower.getY());
	}
}
