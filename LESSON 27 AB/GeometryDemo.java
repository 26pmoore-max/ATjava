import java.util.Scanner;

public class GeometryDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side of the square: ");
        double side = input.nextDouble();

        double perimeter = Geometry.get_perimeter_square(side);
        double area = Geometry.get_area_square(side);

        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);

        input.close();
    }

}
