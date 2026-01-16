import java.util.Scanner;

public class ModifyingArrayA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] scores = new double[10];
        int count = 0;

        System.out.println("Enter test scores (or q to quit):");

        while (count < scores.length) {
            System.out.print("> ");
            String entry = input.next();

            if (entry.equalsIgnoreCase("q")) {
                break;
            }

            scores[count] = Double.parseDouble(entry);
            count++;
        }

        count = remove(scores, count, 1);

        System.out.println("After remove:");
        for (int i = 0; i < count; i++) {
            System.out.println(scores[i]);
        }
    }

    public static int remove(double[] array, int currentSize, int targetIndex) {
        if (targetIndex < 0 || targetIndex >= currentSize) {
            return currentSize;
        }

        for (int i = targetIndex; i < currentSize - 1; i++) {
            array[i] = array[i + 1];
        }

        return currentSize - 1;
    }
}
