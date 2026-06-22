// File Writing Program in Java

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWriting {
    public static void main(String[] args) {

        try (
            Scanner sc = new Scanner(System.in);
            FileWriter writer = new FileWriter("output.txt")
        ) {

            // Input from user
            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            // Write to file
            writer.write(text);

            // Confirmation message
            System.out.println("Data has been written to output.txt");

        } catch (IOException e) {

            // Handle file errors
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
