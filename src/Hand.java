import java.util.List;

public class Hand {

    List<Card> hand;

    public Hand(List<Card> hand) {
        this.hand = hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getValue() {
        int value = 0;

        for (Card card : hand) {
            value += card.getValue();
        }

        return value;
    }

    @Override
    public String toString() {
        return "Hand{" +
                hand +
                '}';
    }
}
