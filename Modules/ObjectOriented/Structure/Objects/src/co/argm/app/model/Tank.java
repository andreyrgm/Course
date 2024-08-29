package co.argm.app.model;

/**
 * Represents the fuel tank of a car with a specific capacity.
 */
public class Tank {
    private final int capacity;

    public Tank() {
        this.capacity = 40;
    }

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
