import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class words {

    private String fileName = "src/main/resources/slowa.txt";


    public ArrayList<String> readFile() {

        ArrayList<String> wordList = new ArrayList<>();
        File file = new File(fileName);
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);
        }

        return wordList;

    }
}





