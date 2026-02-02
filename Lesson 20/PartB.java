import java.io.FileReader;
import java.io.IOException;

public class PartB {
    public static void main(String[] args) {
        String fileName = "characters.txt"; 
        int totalChars = 0;
        int letterCount = 0;
        int digitCount = 0;

        try (FileReader reader = new FileReader(fileName)) {
            int c; 
            while ((c = reader.read()) != -1) { 
                char ch = (char) c; 
                System.out.print(ch); 
                totalChars++; 

                if (Character.isLetter(ch)) {
                    letterCount++;
                }

                if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }
            System.out.println("\n\ncount = " + totalChars);
            System.out.println("letters = " + letterCount);
            System.out.println("digits = " + digitCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}