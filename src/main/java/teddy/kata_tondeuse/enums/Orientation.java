package teddy.kata_tondeuse.enums;

// Enumération représentant les orientations possibles d'une tondeuse
public enum Orientation {
    N, E, S, W; // Nord, Est, Sud, Ouest en anglais

    // Méthode pour faire tourner la tondeuse à gauche ou à droite
    public Orientation rotate(char rotation) {
        switch (this) {
            case N: return rotation == 'D' ? E : W; // Si rotation à droite (D), passe à Est (E), sinon à Ouest (W)
            case E: return rotation == 'D' ? S : N; // Si rotation à droite (D), passe à Sud (S), sinon à Nord (N)
            case S: return rotation == 'D' ? W : E; // Si rotation à droite (D), passe à Ouest (W), sinon à Est (E)
            case W: return rotation == 'D' ? N : S; // Si rotation à droite (D), passe à Nord (N), sinon à Sud (S)
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}
