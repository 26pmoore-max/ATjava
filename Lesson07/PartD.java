 import java.util.Scanner;
public class PartD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer (1 to 3999): ");
        int number = input.nextInt();

        if (number <= 0 || number > 3999) {
            System.out.println("Invalid input. Please enter a number between 1 and 3999.");
        } else {
            String roman = "";

            // thousands
            int thousands = number / 1000;
            if (thousands == 1) roman += "M";
            if (thousands == 2) roman += "MM";
            if (thousands == 3) roman += "MMM";

            // hundreds
            int hundreds = (number % 1000) / 100;
            if (hundreds == 1) roman += "C";
            if (hundreds == 2) roman += "CC";
            if (hundreds == 3) roman += "CCC";
            if (hundreds == 4) roman += "CD";
            if (hundreds == 5) roman += "D";
            if (hundreds == 6) roman += "DC";
            if (hundreds == 7) roman += "DCC";
            if (hundreds == 8) roman += "DCCC";
            if (hundreds == 9) roman += "CM";

            // Tens
            int tens = (number % 100) / 10;
            if (tens == 1) roman += "X";
            if (tens == 2) roman += "XX";
            if (tens == 3) roman += "XXX";
            if (tens == 4) roman += "XL";
            if (tens == 5) roman += "L";
            if (tens == 6) roman += "LX";
            if (tens == 7) roman += "LXX";
            if (tens == 8) roman += "LXXX";
            if (tens == 9) roman += "XC";

            // ones
            int ones = number % 10;
            if (ones == 1) roman += "I";
            if (ones == 2) roman += "II";
            if (ones == 3) roman += "III";
            if (ones == 4) roman += "IV";
            if (ones == 5) roman += "V";
            if (ones == 6) roman += "VI";
            if (ones == 7) roman += "VII";
            if (ones == 8) roman += "VIII";
            if (ones == 9) roman += "IX";

            System.out.println("Roman numeral: " + roman);
        }
    }
}

