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
        int nrAces = 0;

        for (Card card : hand) {

            if (card.getText().equals(CardValue.ACE.getText())) {
                nrAces++;
            }

            value += card.getValue();
        }

        while (nrAces > 0) {
            if (value > 21) {
                value -= 10;
            }
            nrAces--;
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
