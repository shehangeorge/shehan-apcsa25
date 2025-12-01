package cards;

public class Card {
    private int suit;
    private int value;

    private static final String[] SUITS = {"♦", "♣", "♥", "♠"};
    private static final String[] VALUES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(int suit, int value) {
        if (suit < 0) this.suit = 0;
        else if (suit > 3) this.suit = 3;
        else this.suit = suit;

        if (value < 0) this.value = 0;
        else if (value > 12) this.value = 12;
        else this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return SUITS[suit] + VALUES[value];
    }
}
