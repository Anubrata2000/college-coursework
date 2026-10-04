import java.io.File;
import java.io.*;
import java.util.*;

class Copycontent {
    public static void main(String[] args) {
        String inputFile = "anubrata.txt";
        String outputFile = "anubrata1.txt";

        try {
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            int character;

            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
