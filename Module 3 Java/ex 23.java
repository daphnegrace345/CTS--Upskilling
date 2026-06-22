// File Reading Program in Java using Try-With-Resources

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReading {
    public static void main(String[] args) {

        File file = new File("output.txt");

        try (Scanner reader = new Scanner(file)) {

            // Read and display file contents
            System.out.println("Contents of output.txt:");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            // Handle file not found error
            System.out.println("File not found.");
        }
    }
}
