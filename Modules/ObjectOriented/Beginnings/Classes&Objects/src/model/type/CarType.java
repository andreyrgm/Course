package model.type;

/**
 * Enum representing different types of cars with descriptions and the number of doors.
 */
public enum CarType {
    SEDAN("Sedan", "Midsize car", 4),
    STATION_WAGON("Station Wagon", "Big model.model.Car", 5),
    HATCHBACK("Hatchback", "Compact car", 4),
    PICKUP("Pickup", "Pickup", 4),
    COUPE("Coupe", "Small car", 2),
    CONVERTIBLE("Convertible", "Sports car", 2),
    VAN("Van", "Utility car", 3),
    SUV("Suv", "All terrain sports", 5);

    private final String name;
    private final String description;
    private final int numDoors;

    CarType(String name, String description, int numDoors) {
        this.name = name;
        this.description = description;
        this.numDoors = numDoors;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
