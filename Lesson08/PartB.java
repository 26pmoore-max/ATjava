//worked with jake 
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask user for interest rate
        System.out.print("Enter the annual interest rate as a percentage: ");
        double apr = in.nextDouble();
        double rate = apr / 100.0;
        //ask user initial balance
        System.out.print("Enter the initial balance: ");
        double balance = in.nextDouble();
        //format a table
        System.out.printf("%-10s %-20s %-20s\n", "Year", "Interest Amount", "Balance");
        for (int i = 1; i <= 5; i++) { //i++ means add 1 to i each time it loops for the years
            double interest = balance * rate;
            balance += interest;
            System.out.printf("%-10d $%-19.2f $%-19.2f\n", i, interest, balance);
        }        in.close();
    }
}