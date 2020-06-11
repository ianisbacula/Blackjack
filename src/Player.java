import java.util.List;

public abstract class Player {

    Hand hand;
    Boolean bust = false;

    public void drawCard() {
        Card card = Game.deck.dealCard();
        hand.addCard(card);
        System.out.println(hand);
    }

    public void drawHand() {
        List<Card> newHand = Game.deck.dealHand(2);
        hand = new Hand(newHand);
        System.out.println(hand);
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
