import java.util.ArrayList;
import java.util.Scanner;
public class Lesson18C {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a temperature (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int temp = Integer.parseInt(input);
                temperatures.add(temp);
                //if error occurs
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'q'.");
            }
        }
        //low temperature finder
        int lowestTemp = Integer.MAX_VALUE;
        for (Integer temp : temperatures) {
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }
        //prints temperatures with lowest marked
        System.out.println("Temperatures entered:");
        for (Integer temp : temperatures) {
            if (temp == lowestTemp) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }

        scanner.close();
    }
}

