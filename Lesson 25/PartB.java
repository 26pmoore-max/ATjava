//resoued ai to help with formatting
import java.util.ArrayList;
import java.util.Scanner;
class CashRegister {
    private ArrayList<Double> items;

    /*
     * Constructor.
     */
    public CashRegister() {
        items = new ArrayList<>();
    }

    /*
     * Add the price of an item to the register's total.
     */
    public void addItem(double price) {
        items.add(price);
    }

    /*
     * Remove the most recently added item from the current sale.
     */
    public void removeItem() {
        if (!items.isEmpty()) {
            items.remove(items.size() - 1);
        } else {
            System.out.println("No items to remove.");
        }
    }

    /*
     * Return the current total sales amount.
     */
    public double getTotal() {
        double total = 0.0;
        for (double price : items) {
            total += price;
        }
        return total;
    }

    /*
     * Return the total count of items in the current sale.
     */
    public int getCount() {
        return items.size();
    }

    /*
     * Clear the register (total and count) for a new sale.
     */
    public void clear() {
        items.clear();
    }
}

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashRegister register = new CashRegister();

        System.out.println("Cash Register Program");
        System.out.println("Enter a number to add an item.");
        System.out.println("'t' = display total and count");
        System.out.println("'d' = delete most recent item");
        System.out.println("'c' = clear sale");
        System.out.println("'q' = quit");

        while (true) {
            System.out.print("\nEnter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting program.");
                break;
            } 
            else if (input.equalsIgnoreCase("t")) {
                System.out.printf("Total: $%.2f%n", register.getTotal());
                System.out.println("Item count: " + register.getCount());
            } 
            else if (input.equalsIgnoreCase("d")) {
                register.removeItem();
                System.out.println("Most recent item removed.");
            } 
            else if (input.equalsIgnoreCase("c")) {
                register.clear();
                System.out.println("Register cleared.");
            } 
            else {
                try {
                    double value = Double.parseDouble(input);
                    register.addItem(value);
                    System.out.printf("Added: $%.2f%n", value);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
        }

        scanner.close();
    }
}