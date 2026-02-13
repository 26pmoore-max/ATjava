import java.util.Scanner;

public class PartA {
    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score (0-100): ");
        String input = in.nextLine();
        int score; 
        try {
            score = Integer.parseInt(input);
            if (score < 0 || score > 100) {
                throw new NumberFormatException("Score must be between 0 and 100.");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input: " + e.getMessage());
        }
        return score;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int quizScore = getQuizScore(scanner);
            System.out.println("You entered a valid quiz score: " + quizScore);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


// PART B The output is 3 because the finally block always executes and its return statement overrides the return values from both the try and catch blocks.

