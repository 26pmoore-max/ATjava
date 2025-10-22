import java.util.Scanner;

public class PartB {

    enum CustomerType {
        CHILD,
        ADULT,
        SENIOR
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is today Monday? (yes or no): ");
        String day = input.nextLine();

        boolean isItMonday = day.equalsIgnoreCase("yes");

        System.out.print("Enter customer's age: ");
        int age = input.nextInt();

        System.out.print("Enter cost of the meal: ");
        double cost = input.nextDouble();

        CustomerType type;
        if (age < 13) {
            type = CustomerType.CHILD;
        } else if (age >= 50) {
            type = CustomerType.SENIOR;
        } else {
            type = CustomerType.ADULT;
        }

        double discount = 0;

        if (isItMonday) {
            if (type == CustomerType.CHILD) {
                discount = 0.075;
            } else if (type == CustomerType.SENIOR) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (type == CustomerType.CHILD) {
                discount = 0.05;
            } else if (type == CustomerType.SENIOR) {
                discount = 0.075;
            } else {
                discount = 0;
            }
        }

        double finalCost = cost - (cost * discount);

        System.out.println("Customer Type: " + type);
        System.out.println("Discounted cost: $" + finalCost);

        input.close();
    }
}