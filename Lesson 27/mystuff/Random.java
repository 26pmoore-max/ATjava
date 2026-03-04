import mystuff.Random;

public class Random {
public static int getRandom(int n) {
    int val = (int)(Math.random() * n) + 1;
return val;
    }
}
