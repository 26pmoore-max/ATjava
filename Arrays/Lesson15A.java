//used ai to help with some of the logic steps
import java.util.Arrays;
import java.util.Scanner;

public class Lesson15A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] values = new int[10];
        int currentSize = 0;

        while (currentSize < 10) {
            System.out.print("Enter an integer value or 'q' to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next(); 
                break;
            } else {
                values[currentSize] = input.nextInt();
                currentSize++;
            }
        }

       
        System.out.print("*");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

        
        Arrays.sort(values, 0, currentSize);

        
        for (int i = currentSize - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
    }
}
