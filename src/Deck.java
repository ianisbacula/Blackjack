import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();
    private int noCards;
    private int remCards;

    Deck() {

    }

    public void fill() {
        for (CardValue value : CardValue.values()) {
            for (Suit suit : Suit.values()) {
                deck.add(new Card(value.getText(), suit, value.getValue()));
            }
        }

        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> dealHand(int cards) {
        List<Card> hand = new ArrayList<>(cards);

        for (int i = 0; i < cards; i++) {
            hand.add(dealCard());
        }

        return hand;
    }

    public Card dealCard() {
        return deck.remove(0);
    }
}
