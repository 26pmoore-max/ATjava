import java.util.Scanner;

public class PartA {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double temperature = Scanner.nextDouble();
        String scale = Scanner.next().toUpperCase();

        double tempInCelsius;
        if (scale.equals("F")) {
            tempInCelsius = (temperature - 32) * 5 / 9;
        } else {
            tempInCelsius = temperature;
        }

        String state;
        if (tempInCelsius <= 0) {
            state = "solid";
        } else if (tempInCelsius >= 100) {
            state = "gaseous";
        } else {
            state = "liquid";
        }

        System.out.printf("At a temperature of %.2f %s, water is in a %s state.%n", temperature, scale, state);
   Scanner.close();
    }
}
