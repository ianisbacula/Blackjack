public class Card {

    private String text;
    private int value;
    private Suit suit;

    Card(String text, Suit suit, int value) {
        this.text = text;
        this.suit = suit;
        this.value = value;
    }

    Card(String text, Suit suit) {
        this(text, suit, 0);
        /// TODO: implement default values
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
