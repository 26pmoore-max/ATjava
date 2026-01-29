import java.util.ArrayList;
import java.util.Scanner;
public class Lesson18A {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        //gets names from user
        while (true) {
            System.out.print("Enter a name (or # to quit): ");
            input = scanner.nextLine();
            if (input.equals("#")) {
                break;
            }
            names.add(input);
        }
        //prints names
        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}

