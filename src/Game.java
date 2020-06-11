import java.util.ArrayList;
import java.util.List;

public class Game {

    //private static final Game INSTANCE = new Game(); TODO: singleton
    private int nrPlayers;
    static Deck deck;
    private List<BlackjackPlayer> players;
    private Dealer dealer;
    private final int nrRounds = 1;

    Game(int nrPlayers) {
        this.nrPlayers = nrPlayers;
        deck = new Deck();
        players = new ArrayList<>(nrPlayers);
    }

    private void prepareGame() {
        deck.fill();
        dealer = new Dealer();
        for (int i = 0; i < nrPlayers; i++) {
            players.add(new BlackjackPlayer(i));
        }
    }

    private void dealCards() {
        for (BlackjackPlayer player : players) {
            player.drawHand();
        }
        dealer.drawHand();
    }

    private void playRound() {

        dealCards();

        for (BlackjackPlayer player : players) {

            interpretAction(player);
        }

        dealer.play();

        for (BlackjackPlayer player : players) {

            if (player.isBust()) {
                System.out.println("Lost");
                break;
            }

            if (dealer.isBust()) {
                System.out.println("Won");
                break;
            }

            if (player.getScore() > dealer.getScore()) {
                System.out.println("Won");
                break;
            }

            if (player.getScore() == dealer.getScore()) {
                System.out.println("Draw");
                break;
            }

            System.out.println("Lost");
        }
    }

    public void startGame() {
        prepareGame();
        runGame();
    }

    private void runGame() {

        for (int i = 0; i < nrRounds; i++) {
            playRound();
        }
    }

    private void interpretAction(BlackjackPlayer player) {

        boolean play = true;

        while (play) {
            Action action = player.requestAction();

            switch (action) {
                case HIT:
                    player.drawCard();
                    break;
                case STAY:
                    play = false;
                    break;
                case DOUBLE_DOWN:
                    player.drawCard();
                    play = false;
            }

            if (player.getScore() > 21) {
                player.bust();
                play = false;
            }
        }
    }

}
