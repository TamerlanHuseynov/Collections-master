package read_and_write_data_to_a_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFiles_Experiment {
    public static void main(String[] args) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("src/Resources/myFile.txt"));
        System.out.println(allLines);
    }
}
