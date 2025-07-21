package teddy.kata_tondeuse.object;

import teddy.kata_tondeuse.enums.Orientation;

// Classe représentant une tondeuse avec une position (x, y) et une orientation
public class Mower {
    private int x, y; // Coordonnées de la position de la tondeuse
    private Orientation orientation; // Orientation actuelle de la tondeuse

    // Constructeur pour initialiser la position et l'orientation de la tondeuse
    public Mower(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    // Méthode pour faire pivoter la tondeuse selon la rotation spécifiée ('D' pour droite, 'G' pour gauche)
    public void rotate(char rotation) {
        this.orientation = this.orientation.rotate(rotation);
    }

    // Méthode pour déplacer la tondeuse dans la direction de son orientation actuelle
    public void move() {
        switch (this.orientation) {
            case N: y++; break; // Avance vers le nord en incrémentant y
            case E: x++; break; // Avance vers l'est en incrémentant x
            case S: y--; break; // Avance vers le sud en décrémentant y
            case W: x--; break; // Avance vers l'ouest en décrémentant x
        }
    }

    // Accesseurs pour obtenir les coordonnées et l'orientation de la tondeuse
    public int getX() { return x; }
    public int getY() { return y; }
    public Orientation getOrientation() { return orientation; }

    // Mutateurs pour définir les coordonnées x et y de la tondeuse
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}
