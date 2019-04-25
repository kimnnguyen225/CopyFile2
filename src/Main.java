
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {

        // all of Paths's methods are static methods
        Path sourceFile = Paths.get("Files", "RandomText.txt");
        Path targetFile = Paths.get("Files", "target.txt");

        //replace_existing means that if the target file already exists, I want to delete it and
        // create a new version
        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Successfully copied file!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
