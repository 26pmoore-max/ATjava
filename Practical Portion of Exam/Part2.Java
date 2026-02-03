import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        System.out.println("Enter quiz scores (q to quit):");
        while (true) {
            if (input.hasNextDouble()) {
                scores.add(input.nextDouble());
            } else {
                input.next(); 
                break;
            }
        }
        double sum = 0;

        for (double score : scores) {
            System.out.printf("%6.2f%n", score);
            sum += score;
        }
        double average = sum / scores.size();
        System.out.printf("Average: %6.2f%n", average);
        input.close();
    }
}