import MOW.Yard;
import MOW.Mower;
import java.util.Scanner;

public class MainCode {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

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

        System.out.print("enter the height of the lawn: ");
        int height = scanner.nextInt();

        System.out.print("enter the width of the lawn: ");
        int width = scanner.nextInt();

        System.out.println();

        Yard yard = new Yard(height, width);

        // create mower
        Mower mower = new Mower(1, 1, 1);

        // random start
        mower.randomizeStart(yard);

        // animate mowing
        while (mower.updateMower(yard)) {

            clearScreen();
            yard.printYard(mower);
            delay(200);
        }

        // final print
        clearScreen();
        yard.printYard(mower);

        scanner.close();
    }
}