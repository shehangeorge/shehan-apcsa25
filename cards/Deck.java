package cards;

import java.util.Random;

public class Deck {
    private Card[] cards;
    private int top; //index of the next card up --> assigns/initializes a value representing next card to be drawn

    public Deck() {
        cards = new Card[52];
        top = 0;
        int index = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int value = 0; value < 13; value++) {
                cards[index++] = new Card(suit, value);
            }
        }
    }
    //method to shuffle the deck
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int r = rand.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
        
    }
    //cut the deck (one shuffle method)
    public void cut(int index) {
        if (index < 0) index = 0;
        if (index > 51) index = 51;

        Card[] newCards = new Card[52];
        int j = 0;
        for (int i = index; i < 52; i++) newCards[j++] = cards[i];
        for (int i = 0; i < index; i++) newCards[j++] = cards[i];
        cards = newCards;
        top = 0;
    }
    //draw the card on top
    public Card draw() {
        if (top >= 52) return null;
        return cards[top++];
    }
    //print the first n cards
    public void print(int n) {
        for (int i = 0; i <= n && i < 52; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();
    }
}
