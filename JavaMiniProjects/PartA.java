import java.util.Scanner;
public class PartA {
    //code from visual studio code didnt transfer over

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);}
        if (word.equals(reverse)) {
            System.out.println("Palindrome!");} 
            else {
            System.out.println("Not a palindrome.");
        }
    } 
}
}
