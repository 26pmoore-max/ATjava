//got help from from ai to assist in the loop inpurts specifics
import java.util.ArrayList;
import java.util.Scanner;
public class Lesson18D {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

       
        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'q'.");
            }
        }

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println("Modified list:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
