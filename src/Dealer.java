public class Dealer extends Player{


    public void play() {

        while (hand.getValue() < 17) {
            drawCard();
            System.out.println(hand);
        }
    }

}
