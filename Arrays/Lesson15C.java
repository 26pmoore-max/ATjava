//used ai to help me with some of the formatting

import java.util.Arrays;
import java.util.Random;

public class Lesson15C {

    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 10000; 
        int[] data = new int[size];
        Random rand = new Random();

        
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size) + 1;
        }

        
        Arrays.sort(data);

        for (int i = 0; i < 10; i++) {
            int target = rand.nextInt(size) + 1;

            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            long startBinary = System.nanoTime();
            Arrays.binarySearch(data, target);
            long endBinary = System.nanoTime();

            System.out.println("Target: " + target);
            System.out.println("Linear search time: " + (endLinear - startLinear) + " ns");
            System.out.println("Binary search time: " + (endBinary - startBinary) + " ns");
            System.out.println();
        }
    }
}

