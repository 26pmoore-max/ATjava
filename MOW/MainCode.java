import MOW.Yard;
import MOW.Mower;
import java.util.Scanner;

public class MainCode {

    // clear the console screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // delay method
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
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

        // create yard
        Yard yard = new Yard(height, width);

        // place mower on left side of lawn
        // row = 2 puts it inside the lawn
        // col = 1 is just inside left border
        // direction = 1 means facing right
        Mower mower = new Mower(2, 1, 1);

        // animate mower moving across lawn
        while (mower.senseFront(yard) != 'R') {

            clearScreen();

            mower.cutGrass(yard);
            yard.printYard(mower);

            delay(500);

            mower.moveForward();
        }

        // print final position
        clearScreen();
        mower.cutGrass(yard);
        yard.printYard(mower);

        scanner.close();
    }
}
