package read_and_write_data_to_a_file;

import java.io.*;
import java.util.Scanner;

public class ReadTxt {
    public static void main(String[] args) throws IOException {

        String path = "src/read_and_write_data_to_a_file/ReadMe.txt";
        //Buffered Reader - specifically designed to read files:
        FileReader file1 = new FileReader(path);
        BufferedReader read = new BufferedReader(file1);
        System.out.println(read.readLine());
        System.out.println(read.readLine());
        System.out.println("=======================");

        //read file through Scanner:
        Scanner scan = new Scanner(new FileReader(path));
        while (scan.hasNext()) {  System.out.println(scan.nextLine());     }

        System.out.println("=======================");

        // Writing Data to a file:
        String path2 = "src/read_and_write_data_to_a_file/WriteMe.txt";
        FileWriter file = new FileWriter(path2);
        BufferedWriter writer = new BufferedWriter(file);

        writer.write("Hello Everyone!\n");
        writer.write("Let's add a few lines!");
        //make sure to close it, otherwise it would not save data to file:
        writer.close();
    }

}
