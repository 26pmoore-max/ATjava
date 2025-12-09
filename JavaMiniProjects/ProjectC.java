import java.util.Scanner;
public class ProjectC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean ifNumberPrime = true;
        
        if (number <= 1) { // 1 or less means not prime
            ifNumberPrime = false; 
        } else {
            for (int i = 2; i <= number / 2; i++) { // loop until half the number
                if (number % i == 0) { 
                    ifNumberPrime = false; 
                    break; 
                }
            }
        }
        if (ifNumberPrime) { 
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}
