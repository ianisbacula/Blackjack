import java.util.List;

public class Game {

    //private static final Game INSTANCE = new Game(); TODO: singleton
    private int nrPlayers;
    static Deck deck;
    private List<Player> players;

    Game(int nrPlayers) {
        this.nrPlayers = nrPlayers;
    }

    private void prepareGame() {
        deck.fill();

        for (int i = 0; i < nrPlayers; i++) {
            players.add(new Player(i));
        }
    }

    private void playRound() {

        for (Player player : players) {
            player.requestAction();
        }
    }
}
