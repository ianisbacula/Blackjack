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

    public abstract void drawHand();

    public int getScore() {
        return hand.getValue();
    }

    public void bust() {
        bust = true;
    }

    public Boolean isBust() {
        return bust;
    }

    public void reset() {
        bust = false;
        hand = null;
    }

}
