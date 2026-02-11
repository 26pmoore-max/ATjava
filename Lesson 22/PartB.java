import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        try {
            File file = new File("birthyears.txt"); 
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                String yearString = parts[1];

                try {
                    int year = Integer.parseInt(yearString);
                    System.out.println(name + " was born in " + year + ".");
                } catch (NumberFormatException e) {
                    System.out.println("I do not know what year " + name + " was born.");
                }
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

