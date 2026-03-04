
public class PartA {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println("The value of Pi is: " + pi);
        double angleInDegrees = 45.0;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sineValue = Math.sin(angleInRadians);
        System.out.println("The sine of " + angleInDegrees + " degrees is: " + sineValue);
    }

}
