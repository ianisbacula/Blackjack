import java.util.List;
import java.util.Scanner;

public class BlackjackPlayer extends Player{

    Integer playerID;
    Scanner sc = new Scanner(System.in);

    BlackjackPlayer(Integer playerID) {
        this.playerID = playerID;
    }

    public Action requestAction() {

        System.out.println("Choose action:");
        String action = sc.next();
        return Action.getAction(action);
    }

    public void drawHand() {
        List<Card> newHand = Game.deck.dealHand(2);
        hand = new Hand(newHand);
        printHand();
    }

    public void printHand() {
        System.out.println("Player" + playerID + ": " + hand);
    }
}
