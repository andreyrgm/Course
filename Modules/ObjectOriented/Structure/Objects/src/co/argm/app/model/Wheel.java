package co.argm.app.model;

/**
 * Represents a wheel with a maker, rim size, and width.
 */
public class Wheel {
    private final String maker;
    private final Integer rim;
    private final Double width;

    public Wheel(String maker, Integer rim, Double width) {
        this.maker = maker;
        this.rim = rim;
        this.width = width;
    }

    @Override
    public String toString() {
        return "model.Wheel{" +
                "maker='" + maker + '\'' +
                ", rim=" + rim +
                ", width=" + width +
                '}';
    }
}
