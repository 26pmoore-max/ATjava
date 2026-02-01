import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
  
    public static void main(String[] args) throws FileNotFoundException {

       
        ArrayList<Integer> temps = new ArrayList<>();

        
        File file = new File("temps.txt");
        Scanner input = new Scanner(file);

        
        int lowest = Integer.MAX_VALUE;

        
        while (input.hasNextInt()) {
            int temp = input.nextInt();
            temps.add(temp);

            if (temp < lowest) {
                lowest = temp;
            }
        }

        
        for (int temp : temps) {
            if (temp == lowest) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }


        input.close();
    }
}

