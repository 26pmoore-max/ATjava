import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        String filePath = "SalesByCat.txt";

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Department Sales Revenue");
        System.out.println("---------------------------------------------------------------");

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String department = parts[0].trim();
                String manager = parts[1].trim();
                String salesData = parts[2].trim();

                double salesRevenue;
                if (salesData.equalsIgnoreCase("n/a")) {
                    salesRevenue = 0.0; 
                } else {
                salesRevenue = Double.parseDouble(salesData);
                }

    
        System.out.printf("%-15s | %-10s | $ %10.2f%n", department, manager, salesRevenue);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        System.out.println("---------------------------------------------------------------");
    }
}
