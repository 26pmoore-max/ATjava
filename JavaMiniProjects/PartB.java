   import java.util.Random;  
public class PartB {
    // my code from visual studio code didnt transfer over some reason
     import java.util.Random;  
    public static void main(String[] args) {
        Random in = new Random();
        int dice1 = 0;
        int dice2 = 1; 
while (dice1 != dice2) {
            dice1 = in.nextInt(6) + 1;
            dice2 = in.nextInt(6) + 1;
            System.out.println("Dice 1: " + dice1 + "  Dice 2: " + dice2);
        }
        System.out.println("Match! Done.");
    }
}
