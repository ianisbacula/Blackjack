public enum Action {

    HIT("H"),
    STAY("S"),
    DOUBLE_DOWN("DD");

    private final String key;

    Action(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static Action getAction(String input) {
        for (Action action : values()) {
            if (input.equalsIgnoreCase(action.getKey())) {
                return action;
            }
        }
        throw new IllegalArgumentException();
    }
}
