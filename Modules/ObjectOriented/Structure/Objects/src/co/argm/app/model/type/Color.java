package co.argm.app.model.type;

/**
 * Enum representing different colors for the car.
 */
public enum Color {
    RED("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    WHITE("White"),
    GREY("Dark Grey"),
    ORANGE("Orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
