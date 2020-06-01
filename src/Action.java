public enum Action {

    HIT("H"),
    STAY("S"),
    DOUBLE_DOWN("DD");

    private final String key;

    Action(String key) {
        this.key = key;
    }
}
