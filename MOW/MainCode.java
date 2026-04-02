import  MOW.Yard;
import java.util.Scanner;

public class MainCode {

    // clear the console screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the lawn size
        System.out.print("enter the height of the lawn: ");
        int height = scanner.nextInt();

        System.out.print("enter the width of the lawn: ");
        int width = scanner.nextInt();

        System.out.println();

        // create the yard object
        Yard yard = new Yard(height, width);

        // display the initial yard
        System.out.println("initial yard:");
        yard.printYard();

        scanner.close();
    }
}
