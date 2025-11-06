//i referenced sam for help
import java.util.Scanner; 
public class ParatA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  System.out.print("Enter your test scores one by one, then, enter any negative number at the end. \n  ");

double total = 0;
        int count = 0;
        double score;
//loop 
        while (true) {
            System.out.print("Enter score: ");
            score = input.nextDouble();
            if (score < 0) {
                break; //loop ends if negative number is entered
 }
            total += score; // add score to total
            count++; // increment count of scores

        }
        if (count >0) {
            double average = total / count; // calculate average
            System.out.printf("Number of scores entered: %d%n", count);
            System.out.printf("Average score: %.2f%n", average);
        } else {
            System.out.println("No scores were entered.");
       
        }

    input.close();

    }
}




