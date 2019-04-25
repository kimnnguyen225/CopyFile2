
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    /**
     * @param args - collection of strings
     */
    public static void main(String[] args) {

        // all of Paths's methods are static methods
//        Path sourceFile = Paths.get("Files", "RandomText.txt");
//        Path targetFile = Paths.get("Files", "target.txt");

        File sourceFile = new File("Files/RandomText.txt");
        File targetFile = new File("Files/copiedRandomText.txt");

        /**
         * intention action: Alt + Enter
         */
        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
        //replace_existing means that if the target file already exists, I want to delete it and
        // create a new version
        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Successfully copied file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }
}
