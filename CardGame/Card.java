import java.util.Random;

public class Card {

    // Enum for Suit
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }

    // Enum for Rank
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING, ACE
    }

    // Private member variables
    private Suit suit;
    private Rank rank;

    // Default constructor (random card)
    public Card() {
        Random rand = new Random();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        suit = suits[rand.nextInt(suits.length)];
        rank = ranks[rand.nextInt(ranks.length)];
    }

    // Overloaded constructor
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // getSuit method
    public Suit getSuit() {
        return suit;
    }

    // getRank method
    public Rank getRank() {
        return rank;
    }

    // getFace method
    public String getFace() {
        char suitChar = ' ';
        char rankChar = ' ';

        // Determine suit character
        switch (suit) {
            case SPADE:
                suitChar = '\u2660'; // ♠
                break;
            case HEART:
                suitChar = '\u2661'; // ♡
                break;
            case CLUB:
                suitChar = '\u2663'; // ♣
                break;
            case DIAMOND:
                suitChar = '\u2662'; // ♢
                break;
        }

        // Determine rank character
        switch (rank) {
            case TWO:   rankChar = '2'; break;
            case THREE: rankChar = '3'; break;
            case FOUR:  rankChar = '4'; break;
            case FIVE:  rankChar = '5'; break;
            case SIX:   rankChar = '6'; break;
            case SEVEN: rankChar = '7'; break;
            case EIGHT: rankChar = '8'; break;
            case NINE:  rankChar = '9'; break;
            case TEN:   rankChar = 'T'; break;
            case JACK:  rankChar = 'J'; break;
            case QUEEN: rankChar = 'Q'; break;
            case KING:  rankChar = 'K'; break;
            case ACE:   rankChar = 'A'; break;
        }

        return "" + suitChar + rankChar;
    }

    // Main method to test
    public static void main(String[] args) {

        System.out.println("The following card should be the queen of hearts,");
        Card card = new Card(Suit.HEART, Rank.QUEEN);
        System.out.println("  " + card.getFace());

        System.out.println("\n10 random cards...");

        for (int i = 0; i < 10; i++) {
            Card randomCard = new Card();
            System.out.println("  " + randomCard.getFace());
        }
    }
}