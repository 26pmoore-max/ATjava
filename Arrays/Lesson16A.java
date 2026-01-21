 import java.util.Scanner;
public class Lesson16A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = new String[50]; // partially filled array
        int size = 0;

        while (true) {
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            String input = in.nextLine();

            if (input.equals("q")) {
                break;
            }

            words[size] = input;
            size++;
        }

        System.out.println("Words/Phrases (current size = " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + words[i]);
        }

        cleanup(words, size);

        System.out.println("Modified array...");
        System.out.println("Words/Phrases (current size = " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + words[i]);
        }
    }

    public static void cleanup(String[] arr, int size) {
        for (int i = 0; i < size; i++) {
            String s = arr[i].trim();
            s = s.toLowerCase();

            if (s.length() > 0) {
                s = s.substring(0, 1).toUpperCase() + s.substring(1);
            }

            arr[i] = s;
        }
    }
}

