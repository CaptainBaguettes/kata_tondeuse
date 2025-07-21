package teddy.kata_tondeuse;

import teddy.kata_tondeuse.enums.Orientation;
import teddy.kata_tondeuse.object.Lawn;
import teddy.kata_tondeuse.object.Mower;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MowItNow {

    // Méthode pour gérer les tondeuses selon les instructions d'un fichier
    public void manageMowers(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Lecture de la première ligne pour obtenir les dimensions de la pelouse
            String[] lawnDimensions = br.readLine().split(" ");
            Lawn lawn = new Lawn(Integer.parseInt(lawnDimensions[0]), Integer.parseInt(lawnDimensions[1]));

            String line;
            // Lecture des informations pour chaque tondeuse
            while ((line = br.readLine()) != null) {
                // Création d'une nouvelle tondeuse avec sa position et orientation initiale
                String[] mowerData = line.split(" ");
                Mower mower = new Mower(
                        Integer.parseInt(mowerData[0]),
                        Integer.parseInt(mowerData[1]),
                        Orientation.valueOf(mowerData[2])
                );

                // Lecture des instructions pour la tondeuse actuelle
                String instructions = br.readLine();

                // Exécution des instructions pour la tondeuse
                executeInstructions(mower, instructions, lawn);

                // Affichage de la position et de l'orientation finale de la tondeuse
                System.out.print(mower.getX() + " " + mower.getY() + " " + mower.getOrientation() + " ");
            }
        } catch (IOException e) {
            // Gestion des exceptions en cas d'erreur de lecture du fichier
            e.printStackTrace();
        }
    }

    // Méthode pour exécuter les instructions pour une tondeuse donnée
    void executeInstructions(Mower mower, String instructions, Lawn lawn) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'D' || instruction == 'G') {
                // Rotation de la tondeuse selon l'instruction
                mower.rotate(instruction);
            } else if (instruction == 'A') {
                // Sauvegarde de la position actuelle de la tondeuse
                int oldX = mower.getX(), oldY = mower.getY();
                // Déplacement de la tondeuse
                mower.move();
                // Vérification si la nouvelle position est hors des limites de la pelouse
                if (!lawn.isWithinBounds(mower.getX(), mower.getY())) {
                    // Si hors limite, la tondeuse revient à sa position précédente
                    mower.setX(oldX);
                    mower.setY(oldY);
                }
            }
        }
    }
}
