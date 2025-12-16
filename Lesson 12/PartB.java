import java.util.Scanner;

public class PartB {
   public static double smallest(double x, double y, double z)
   {
      double smallest = x;

      if (y < smallest)
      {
         smallest = y;
      }

      if (z < smallest)
      {
         smallest = z;
      }

      return smallest;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter first number: ");
      double a = in.nextDouble();

      System.out.print("Enter second number: ");
      double b = in.nextDouble();

      System.out.print("Enter third number: ");
      double c = in.nextDouble();

      double result = smallest(a, b, c);
      System.out.println("The smallest value is: " + result);
   }
}