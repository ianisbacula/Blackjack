import java.util.List;

public class Dealer extends Player {

    public void drawHand() {
        List<Card> newHand = Game.deck.dealHand(2);
        newHand.get(1).setHidden();
        hand = new Hand(newHand);
        printHand();
    }

    public void play() {

        showHiddenCard();

        while (hand.getValue() < 17) {
            drawCard();
        }
        if (hand.getValue() > 21) {
            bust();
        }
    }

    public void showHiddenCard() {
        hand.hand.get(1).setVisible();
        printHand();
    }

    public void printHand() {
        System.out.println("Dealer:" + hand);
    }

}
