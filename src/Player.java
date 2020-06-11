import java.util.List;

public abstract class Player {

    Hand hand;
    Boolean bust = false;

    public abstract void printHand();

    public void drawCard() {
        Card card = Game.deck.dealCard();
        hand.addCard(card);
        printHand();
    }

    public void drawHand() {
        List<Card> newHand = Game.deck.dealHand(2);
        hand = new Hand(newHand);
        printHand();
    }

    public int getScore() {
        return hand.getValue();
    }

    public void bust() {
        bust = true;
    }

    public Boolean isBust() {
        return bust;
    }

}
