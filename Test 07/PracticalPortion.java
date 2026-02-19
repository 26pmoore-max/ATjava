import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticalPortion {
    public static void main(String[] args) {
        try {
            File file = new File("mathmeet.txt");
            Scanner scanner = new Scanner(file);
            
            System.out.printf("%-20s | %-20s  | %-10s%n", "Name", "School", "Score");
            System.out.println("---------------------------------------------------");
            double totalScore = 0;
            int count = 0;
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                
                String name = parts[0];
                String school = parts[1];
                double score = Double.parseDouble(parts[2]);
                
                System.out.printf("%-20s | %-20s | %-10.1f%n ", name, school, score);
                
                totalScore += score;
                count++;
            }
            
            double averageScore = totalScore / count;
            System.out.println("----------------------------------------------------");
            System.out.printf("Average Score: %.2f%n", averageScore);
            scanner.close(); 
            
        } catch (FileNotFoundException error) {
            System.out.println("File not found: " + error.getMessage());
        }
    }
}