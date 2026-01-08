import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] scores = new double[10];
        int count = 0;

        System.out.println("Enter test scores (or q to quit):");

        while (count < 10) {
            System.out.print("> ");
            String entry = input.next();

            if (entry.equalsIgnoreCase("q")) {
                break;
            }

            scores[count] = Double.parseDouble(entry);
            count++;
        }

        double sum = 0;
        double max = scores[0];

        for (int i = 0; i < count; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double average = sum / count;

        System.out.println("\nCount: " + count);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
    }
}
