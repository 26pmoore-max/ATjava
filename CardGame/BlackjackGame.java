import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackjackGame {

    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10",
            "J","Q","K","A"};

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=== BLACKJACK GAME ===");
            System.out.print("Play a hand? (y/n): ");
            String choice = input.nextLine();

            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Thanks for playing!");
                break;
            }

            ArrayList<Card> playerHand = new ArrayList<>();
            ArrayList<Card> dealerHand = new ArrayList<>();

            // Initial deal
            playerHand.add(drawCard());
            dealerHand.add(drawCard());
            playerHand.add(drawCard());
            dealerHand.add(drawCard());

            System.out.println("\nYour cards: " + playerHand);
            System.out.println("Dealer shows: " + dealerHand.get(0));

            // Check immediate blackjack
            int playerScore = getScore(playerHand);
            int dealerScore = getScore(dealerHand);

            if (playerScore == 21 || dealerScore == 21) {
                System.out.println("Dealer hidden card: " + dealerHand.get(1));
                System.out.println("Your score: " + playerScore);
                System.out.println("Dealer score: " + dealerScore);

                if (playerScore == 21 && dealerScore == 21) {
                    System.out.println("Draw!");
                } else if (playerScore == 21) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Dealer wins!");
                }
                continue;
            }

            // PLAYER TURN
            while (true) {
                System.out.println("\nYour hand: " + playerHand);
                System.out.println("Score: " + getScore(playerHand));

                if (getScore(playerHand) > 21) {
                    System.out.println("You busted! Dealer wins.");
                    break;
                }

                System.out.print("Hit or Stand? (h/s): ");
                String move = input.nextLine();

                if (move.equalsIgnoreCase("h")) {
                    playerHand.add(drawCard());
                } else {
                    break;
                }
            }

            if (getScore(playerHand) > 21) continue;

            // DEALER TURN
System.out.println("\nDealer reveals hidden card: " + dealerHand.get(1));

while (getScore(dealerHand) < 17) {
    dealerHand.add(drawCard());
}

int finalPlayer = getScore(playerHand);
int finalDealer = getScore(dealerHand);

System.out.println("\nFinal Hands:");
System.out.println("Your hand: " + playerHand + " | Score: " + finalPlayer);
System.out.println("Dealer hand: " + dealerHand + " | Score: " + finalDealer);


if (finalDealer > 21) {
    System.out.println("Dealer busts! You win!");
} 
else if (finalPlayer > 21) {
    System.out.println("You busted! Dealer wins!");
}
else if (finalPlayer > finalDealer) {
    System.out.println("You win!");
}
else if (finalDealer > finalPlayer) {
    System.out.println("Dealer wins!");
}
else {
    System.out.println("Draw!"); 
}

    // Draws random card (infinite deck)
    public static Card drawCard() {
        String suit = suits[rand.nextInt(suits.length)];
        String rank = ranks[rand.nextInt(ranks.length)];
        return new Card(rank, suit);
    }

    // Calculate score with ace handling
    public static int getScore(ArrayList<Card> hand) {

        int score = 0;
        int aceCount = 0;

        for (Card c : hand) {
            String r = c.getRank();

            if (r.equals("J") || r.equals("Q") || r.equals("K")) {
                score += 10;
            } else if (r.equals("A")) {
                score += 11;
                aceCount++;
            } else {
                score += Integer.parseInt(r);
            }
        }

        // Adjust Aces from 11 to 1 if bust
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }
}