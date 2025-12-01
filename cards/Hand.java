package cards;

public class Hand {
    private Card[] cards;
    private int length; //initializes the current number of cards in hand

    public Hand(int maxCards) {
        cards = new Card[maxCards];
        length = 0; //initializes the length variable
    }

    public void add(Card c) { //add a card to the hand (no need to return anything)
        if (length < cards.length) {
            cards[length++] = c;
        }
    }

    public int length() {
        return length; //returns the current number of cards in hand, no changes to be made
    }

    public Card get(int index) { 
        if (index < 0 || index >= length) return null;
        return cards[index]; //what card is at x index
    }

    public Card remove(int index) {
        if (index < 0 || index >= length) return null;
        Card removed = cards[index]; //remove a card at a specific index
        for (int i = index; i < length - 1; i++) {
            cards[i] = cards[i + 1];
        }
        cards[--length] = null;
        return removed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(); //return the string version of the hand (NOT the int, the string version from the array)
        for (int i = 0; i < length; i++) {
            sb.append(cards[i]).append(" ");
        }
        return sb.toString().trim();
    }
}