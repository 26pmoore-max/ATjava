import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is today Monday?: ");
        String isItMondayInput = scanner.nextLine().toLowerCase();
        boolean isItMonday = isItMondayInput.equals("yes");

        System.out.print("Enter the customer's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the cost of the meal: $");
        double cost = scanner.nextDouble();

        double discountRate = 0.0;

        if (isItMonday) {
            if (age < 13) {
                discountRate = 0.075; 
            } else if (age >= 50) {
                discountRate = 0.15; 
            } else {
                discountRate = 0.05; 
            }
        } else {
            if (age < 13) {
                discountRate = 0.05; 
            } else if (age >= 50) {
                discountRate = 0.075; 
            } else {
                discountRate = 0.0; 
            }
        }

        double discountAmount = cost * discountRate;
        double finalCost = cost - discountAmount;

        System.out.printf("Original Cost: $%.2f\n", cost);
        System.out.printf("Discount Applied: $%.2f (%.1f%%)\n", discountAmount, discountRate * 100);
        System.out.printf("Final Cost: $%.2f\n", finalCost);

        scanner.close();
    }
}
