import java.util.Scanner;

public class Player {

    Hand hand;
    Integer playerID;
    Scanner sc = new Scanner(System.in);

    Player(Integer playerID) {
        this.playerID = playerID;
    }

    public void drawCard() {
        Card card = Game.deck.dealCard();
        hand.addCard(card);
    }

    public Action requestAction() {
        String action = sc.next();
        return Action.valueOf(action);
    }
}
