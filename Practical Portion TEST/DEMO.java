import Org.Derryfield.Math.Algebra;

public class DEMO {

    public static void main(String[] args) {

        try {
            double result = Algebra.harmonicMean(1, 2);
            System.out.println("Harmonic Mean: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
