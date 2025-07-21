package teddy.kata_tondeuse;

import org.junit.Test;
import teddy.kata_tondeuse.enums.Orientation;
import teddy.kata_tondeuse.object.Lawn;
import teddy.kata_tondeuse.object.Mower;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;


public class MowItNowTest {

    @Test
    public void testManageMowers() throws Exception {
        // Créer un fichier temporaire avec le contenu d'entrée
        Path tempFile = Files.createTempFile("mower-input", ".txt");
        Files.write(tempFile, "5 5\n1 2 N\nGAGAGAGAA\n3 3 E\nAADAADADDA".getBytes());

        // Rediriger la sortie standard pour capturer les résultats
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Exécuter la méthode manageMowers avec le fichier temporaire
        MowItNow mowItNow = new MowItNow();
        mowItNow.manageMowers(tempFile.toString());

        // Vérifier que la sortie correspond au résultat attendu
        assertEquals("1 3 N 5 1 E ", outContent.toString());

        // Supprimer le fichier temporaire
        Files.delete(tempFile);
    }

    @Test
    public void testExecuteInstructions() {
        Lawn lawn = new Lawn(5, 5);
        Mower mower = new Mower(1, 2, Orientation.N);

        MowItNow mowItNow = new MowItNow();
        mowItNow.executeInstructions(mower, "GAGAGAGAA", lawn);

        assertEquals(1, mower.getX());
        assertEquals(3, mower.getY());
        assertEquals(Orientation.N, mower.getOrientation());
    }
}
