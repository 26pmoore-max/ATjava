public class Baseballcard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public Baseballcard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}