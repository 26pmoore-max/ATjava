package Org.Derryfield.Math;

public class Algebra {

    public static double harmonicMean(double x, double y) {
        
        if (x <= 0 || y <= 0) { //exception that needs to be thrown
            throw new IllegalArgumentException("Values must be positive.");
        }

        if ((x + y) == 0) { //exception that needs to be thrown
            throw new IllegalArgumentException("Sum of values cannot be zero.");
        }

        return (2 * x * y) / (x + y);
    }
}
