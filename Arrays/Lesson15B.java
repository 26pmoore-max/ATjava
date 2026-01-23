//used ai to help me count through the loop
import java.util.Scanner;

public class Lesson15B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] values = new int[20];
        int currentSize = 0;

        while (currentSize < 20) {
            System.out.print("Enter an integer value or 'q' to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next(); 
                break;
            } else {
                values[currentSize] = input.nextInt();
                currentSize++;
            }
        }

        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Enter a target integer value: ");
        int target = input.nextInt();

        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (values[i] == target) {
                count++;
            }
        }

        System.out.println("The value " + target + " occurs " + count + " times in your original data set.");
    }
}

