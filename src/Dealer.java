public class Dealer extends Player{

    Boolean showCard = false;

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
        showCard = true;
        printHand();
    }

    public void printHand() {

        if (showCard) {
            System.out.println("Dealer:" + hand);
        } else {
            //improv
            //TODO add hidden attribute for card
            System.out.println("Dealer:" + hand.hand.get(0) + ", {hidden card}");
        }
    }

}
