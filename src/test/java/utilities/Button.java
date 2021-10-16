package utilities;

public enum Button {

    RESET("reset"),

    WEIGH("weigh"),

    RESULT("result");

    private final String button;

    Button(String button) {
        this.button = button;
    }

    public String getButton() {
        return button;
    }

}
