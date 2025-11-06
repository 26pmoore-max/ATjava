import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a phrase:");
        String phrase = input.nextLine();

        int x = 0;

         for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E') {
                x++;
            }
        }
    
     System.out.printf("The letter 'e' appears %d times in the phrase.%n", x);
          
    }
}
