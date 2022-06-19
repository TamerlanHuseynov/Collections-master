package read_and_write_data_to_a_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReader_Experiment {

    public static void main(String[] args){
        String fileName = "src/Resources/myFile.txt";
        List<String> lines = parseTextFile(fileName);

        for(String line: lines){
            System.out.println(line);
        }

    }

    public static List<String> parseTextFile(String fileName) {
        return new ArrayList<String>(){{
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    while (br.ready()) {
                        add(br.readLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }};
    }

}
