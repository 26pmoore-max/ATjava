import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {

        try {

            File inputFile = new File("quizzes.txt");
            Scanner input = new Scanner(inputFile);

            PrintWriter output = new PrintWriter("quizzesMod.txt");

            int quizNum = 0;
            double sum = 0;

            while (input.hasNextDouble()) {
                double score = input.nextDouble();
                sum += score;

                output.printf("Quiz %03d: %6.2f%n", quizNum, score);
                quizNum++;
            }

            double average = sum / quizNum;

            output.println("----------------");
            output.printf("Average: %6.2f%n", average);

            input.close();
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
