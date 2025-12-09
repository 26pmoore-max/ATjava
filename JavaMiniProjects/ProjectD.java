 import java.util.Scanner; 

public class ProjectD { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a value from 0 to 20: "); 
        int numberEntered = input.nextInt();

       
        String bar = ""; // start with an empty part that will become the progress bar

        for (int i = 0; i < numberEntered; i++) { // loop from 0 up to the number entered
            bar += "#"; // # for every completed part
        }

        for (int i = numberEntered; i < 20; i++) { // loop from number entered to 20
            bar += "-"; // add a - for for leftover part
        }

        int percent = (numberEntered * 100) / 20; // math to find percent completed

        System.out.println("Progress: [" + bar + "] " + percent + "%"); 
    }
}

