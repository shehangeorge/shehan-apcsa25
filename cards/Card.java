package cards;

public class Card {
    private int suit; //assign a number to each suit and those are the ints
    private int value; //a number to each number obviously and then a number to each face card (e.g. 11 for jack, etc.)

    private static final String[] SUITS = {"♦", "♣", "♥", "♠"};
    private static final String[] VALUES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(int suit, int value) { //constructor to only use valid range --> I believe this fixes the out of bounds error
        if (suit < 0) this.suit = 0;
        else if (suit > 3) this.suit = 3;
        else this.suit = suit;

        if (value < 0) this.value = 0;
        else if (value > 12) this.value = 12;
        else this.value = value;
    }

    public int getValue() {
        return value; //returns the value of the card as an int
    }

    public String toString() {
        return SUITS[suit] + VALUES[value]; //returns the value of the card as specified in the array (w/ symbols and all)
    }
}
