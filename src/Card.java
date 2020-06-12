public class Card {

    private String text;
    private int value;
    private Suit suit;
    private Boolean hidden;

    public Card(String text, Suit suit, int value) {
        this.text = text;
        this.suit = suit;
        this.value = value;
        hidden = false;
    }

    public Card(String text, Suit suit) {
        this(text, suit, 0);
        /// TODO: implement default values
    }

    public String getText() {
        return text;
    }

    public int getValue() {
        return value;
    }

    public Boolean checkHidden() {
        return hidden;
    }

    public void setHidden() {
        hidden = true;
    }

    public void setVisible() {
        hidden = false;
    }

    @Override
    public String toString() {

        if (hidden) {
            return "{hidden card}";
        } else {
            return "{" + text +
                    ", " + suit +
                    '}';
        }
    }
}
