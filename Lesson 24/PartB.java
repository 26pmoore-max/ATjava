import java.util.Scanner;

public class PartB {

    static class Counter {
        private int count;

        public Counter() {
            count = 0;
        }

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        System.out.println("Enter 'c' for cake");
        System.out.println("Enter 'p' for pie");
        System.out.println("Enter 'q' to quit");

        char choice;

        do {
            System.out.print("Your choice: ");
            choice = in.next().toLowerCase().charAt(0);

            if (choice == 'c') {
                cakeCounter.increment();
            } 
            else if (choice == 'p') {
                pieCounter.increment();
            }

        } while (choice != 'q');

        System.out.println("\nTotal votes for cake: " + cakeCounter.getCount());
        System.out.println("Total votes for pie: " + pieCounter.getCount());

        in.close();
    }
}
