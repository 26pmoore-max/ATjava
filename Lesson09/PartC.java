public class PartC {
public static void main(String[] args) {
    int sum = 0;
    int count = 10; 
    for (int i = 0; i < count; i++) {
       int randomNum = (int)(Math.random() * 10) + 1; //number 1 - 10
       System.out.println(randomNum);
         sum += randomNum;
    }
    double average = (double) sum / count;
    System.out.printf("The average of the 10 random numbers is: %.2f%n", average);
    System.out.println("End of program.");

    }
}

