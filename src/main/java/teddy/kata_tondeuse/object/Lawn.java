package teddy.kata_tondeuse.object;

// Classe représentant une pelouse avec des dimensions maximales en X et Y
public class Lawn {
    private final int maxX, maxY; // Dimensions maximales de la pelouse

    // Constructeur pour initialiser les dimensions de la pelouse
    public Lawn(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    // Méthode pour vérifier si des coordonnées (x, y) sont dans les limites de la pelouse
    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x <= maxX && y >= 0 && y <= maxY;
    }
}
