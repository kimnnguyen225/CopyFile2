import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "Files/RandomText.txt";
        String targetFile = "Files/TargetFile.txt";

        try (
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile)

        ) {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File has successfully copied!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
