// Package: java.time
// Parent package: java

import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {
        
        // Get current date
        LocalDate today = LocalDate.now();
        
        // Get current time
        LocalTime now = LocalTime.now();
        
        // Display output
        System.out.println("Today's date is " + today);
        System.out.println("The time is " + now);
    }
}

