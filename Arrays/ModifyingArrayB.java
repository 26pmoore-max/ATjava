import java.util.Scanner;

public class ModifyingArrayB {
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

        count = insert(scores, count, 1, 95.0);

        System.out.println("After insert:");
        for (int i = 0; i < count; i++) {
            System.out.println(scores[i]);
        }
    }

    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        if (currentSize >= array.length || targetIndex < 0 || targetIndex > currentSize) {
            return currentSize;
        }

        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }

        array[targetIndex] = newElement;
        return currentSize + 1;
    }
}
