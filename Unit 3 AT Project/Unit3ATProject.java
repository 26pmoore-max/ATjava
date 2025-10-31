//I worked with jake in part on reporting an error and having the code reset
//I worked with chloe to help me with some of the formatting
//I worked with alex to help me with enumerated data types and some of the formatting as well


import java.util.Scanner;

public class Unit3ATProject {
enum DayOfWeek { MON, TUE, WED, THU, FRI, SAT, SUN}
enum CustomerType { ADULT, CHILD, SENIOR, BABY}
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input day
        System.out.print("Enter the day of the week (first three letters or full name, ex mon or monday): ");
        String dayOfWeek = scanner.nextLine().toLowerCase();

        // Input time
        System.out.print("Enter the time (HH:MM): ");
        String timeOfDay = scanner.nextLine().trim();
        int hour = 0;
        int min = 0;

        if (timeOfDay.contains(":")) {
            int i = timeOfDay.indexOf(":");
            hour = Integer.parseInt(timeOfDay.substring(0, i));
            min = Integer.parseInt(timeOfDay.substring(i + 1));
        } else {
            System.err.println("Unable to parse time, stopping program.");
            return;
        }

        // Input age 
        //alex helped me with the enumerated data type for age here
        System.out.print("Enter your age as an integer: ");
        int age = Integer.parseInt(scanner.nextLine());
        CustomerType customerType;
        if (age >= 0 && age <= 2) {
            customerType = CustomerType.BABY;
        } else if (age >= 3 && age <= 12) {
            customerType = CustomerType.CHILD;
        } else if (age >= 60) {
            customerType = CustomerType.SENIOR;
        } else {
            customerType = CustomerType.ADULT;
        }

        // Student yes or no
        System.out.print("Are you a student? (y/n): ");
        String studentInputYN = scanner.nextLine().toLowerCase();
        boolean ifStudent = studentInputYN.equals("y");

        // Formatting to display day correclty
        DayOfWeek day;
        if (dayOfWeek.equals("monday") || dayOfWeek.equals("mon")) {
            day = DayOfWeek.MON;
        } else if (dayOfWeek.equals("tuesday") || dayOfWeek.equals("tue")) {
            day = DayOfWeek.TUE;
        } else if (dayOfWeek.equals("wednesday") || dayOfWeek.equals("wed")) {
            day = DayOfWeek.WED;
        } else if (dayOfWeek.equals("thursday") || dayOfWeek.equals("thu")) {
            day = DayOfWeek.THU;
        } else if (dayOfWeek.equals("friday") || dayOfWeek.equals("fri")) {
            day = DayOfWeek.FRI;
        } else if (dayOfWeek.equals("saturday") || dayOfWeek.equals("sat")) {
            day = DayOfWeek.SAT;
        } else if (dayOfWeek.equals("sunday") || dayOfWeek.equals("sun")) {
            day = DayOfWeek.SUN;
        } else {
            System.out.println("Error: Invalid day entered.");
            return;
        }

        // Base price
        double basePrice = 100.0; // Regular price
        if (day == DayOfWeek.SAT || (day == DayOfWeek.SUN)) {
            basePrice = 80.0;
        } else {
            if ((hour >= 6.00 && hour <= 7.59) || (hour >= 16.00 && hour <= 17.59)) {
                basePrice = 100.0; // Rush hour price
            } else {
                basePrice = 90.0; // Weekday non-rush hour price
            }
        }

        // Age discount
        double ageDiscount;

        switch (customerType) {//switch is like a chain of if else statements- alex taught me this
            case BABY:
                ageDiscount = basePrice; // 100% discount
                break;
            case CHILD:
                ageDiscount = basePrice * 0.20; // 20% discount
                break;
            case SENIOR:
                ageDiscount = basePrice * 0.25; // 25% discount
                break;
            default:
                ageDiscount = 0.0; // No discount for adults
                break;
        }
        // Price after age discount
        double priceAfterAgeDiscount = basePrice - ageDiscount;

        // Student discount 5%
        double studentDiscount = 0.0;
        if (ifStudent && age > 2) {// Student discount only applies if age > 2 cause otherwise free
            studentDiscount = priceAfterAgeDiscount * 0.05; // 5% student discount
            priceAfterAgeDiscount -= studentDiscount;
        }

        double finalPrice = priceAfterAgeDiscount; // Final price after all discounts

        // formatting I got some help from alex to remind me how to use enumerated data types correctly
        System.out.println("--------------------------------------------------");
        System.out.printf("Name: %s\nDay: %s\nTime: %02d:%02d\n", name, day, hour, min);
        System.out.println("--------------------------------------------------");
        System.out.printf("Base Price: $%.2f", basePrice);
        if ((day == DayOfWeek.MON 
            || day == DayOfWeek.TUE
            || day == DayOfWeek.WED
            || day == DayOfWeek.THU
            || day == DayOfWeek.FRI
            && ((hour >= 6 && hour <= 7) 
            || (hour >= 16 && hour <= 17)))) {
            System.out.print(" (RUSH HOUR FARE)");
        }
        System.out.println();
        System.out.printf("Age Discount: $%.2f\n", ageDiscount);
        System.out.printf("Student Discount: $%.2f\n", -studentDiscount);
        System.out.println("--------------------------------------------------");
        System.out.printf("Final Cost: $%.2f\n", finalPrice);
        System.out.println("--------------------------------------------------");

     
    }
}
