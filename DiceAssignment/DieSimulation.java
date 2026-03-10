import java.util.Scanner;

public class DieSimulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Die die = new Die();
        String input;

        while (true) {

            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            input = scanner.nextLine();

            if (input.equals("r")) {
                die.roll();
                System.out.println("die was rolled. value = " + die.getValue());
            }

            else if (input.equals("d")) {
                die.display();
            }

            else if (input.equals("q")) {
                System.out.println("Bye!");
                break;
            }
        }

        scanner.close();
    }
}
