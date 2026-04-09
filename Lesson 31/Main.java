public class Main {
    public static void main(String[] args) {
        Baseballcard card1 = new Baseballcard("Mike Trout", 2018);
        Baseballcard card2 = new Baseballcard("Mike Trout", 2018);
        Baseballcard card3 = new Baseballcard("Babe Ruth", 1927);

        // Test toString()
        System.out.println(card1);
        System.out.println(card3);

        // Test equals()
        System.out.println("card1 equals card2: " + card1.equals(card2)); // true
        System.out.println("card1 equals card3: " + card1.equals(card3)); // false
    }
}