import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();
    private int noCards;
    private int remCards;

    Deck() {

    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card[] dealHand(int cards) {
        Card[] hand = new Card[cards];

        for (int i = 0; i < cards; i++) {
            hand[i] = dealCard();
        }

        return hand;
    }

    public Card dealCard() {
        return deck.remove(0);
    }
}
