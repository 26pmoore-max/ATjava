import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws IOException {

        File file = new File("customerdata.txt");
        Scanner in = new Scanner(file);

        in.useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.println("   ID  |    Name     |     Balance ");
        System.out.println("---------------------------------------");

        while (in.hasNext()) {
            int id = in.nextInt();       // customer ID
            String name = in.next();     // customer name
            double balance = in.nextDouble(); // balance
            System.out.printf("%06d | %11s | $ %,12.2f%n", //resourced ai to help with formatting here
                    id, name, balance);
        }

        in.close();
    }
}
