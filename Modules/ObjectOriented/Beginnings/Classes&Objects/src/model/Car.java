package model;

import model.type.CarType;
import model.type.Color;

/**
 * Represents a car with various attributes such as maker, model, color, motor, etc.
 * Implements Comparable for comparing cars by maker.
 */
public class Car implements Comparable<Car> {
    public static final Integer MAX_ROAD_SPEED = 120;
    public static final int MAX_CITY_SPEED = 120;
    private static Color patentColor = Color.ORANGE;
    private static int staticTankCapacity = 30;
    private static int lastId;
    private final int id;
    private final Wheel[] wheels;
    private String maker;
    private String model;
    private Color color = Color.GREY;
    private Motor motor;
    private CarType type;
    private Tank tank;
    private Person driver;
    private int wheelIndex;

    /**
     * Default constructor, initializes the car with a unique id and an array for wheels.
     */
    public Car() {
        this.id = ++lastId;
        this.wheels = new Wheel[5];
    }

    /**
     * Constructor with maker, model, and driver.
     *
     * @param maker  The car's maker.
     * @param model  The car's model.
     * @param driver The car's driver.
     */
    public Car(String maker, String model, Person driver) {
        this();
        this.maker = maker;
        this.model = model;
        this.driver = driver;
    }

    /**
     * Full constructor with all attributes.
     *
     * @param maker  The car's maker.
     * @param model  The car's model.
     * @param color  The car's color.
     * @param motor  The car's motor.
     * @param type   The type of the car.
     * @param tank   The car's fuel tank.
     * @param driver The car's driver.
     */
    public Car(String maker, String model, Color color, Motor motor, CarType type, Tank tank, Person driver) {
        this(maker, model, driver);
        this.color = color;
        this.motor = motor;
        this.type = type;
        this.tank = tank;
    }

    // Static method to set the patent color
    public static void setPatentColor(Color patentColor) {
        Car.patentColor = patentColor;
    }

    // Static method to set the static tank capacity
    public static void setStaticTankCapacity(int staticTankCapacity) {
        Car.staticTankCapacity = staticTankCapacity;
    }

    /**
     * Static method to calculate the fuel consumption using a static tank capacity.
     *
     * @param km                 The distance traveled in kilometers.
     * @param gasolinePercentage The percentage of gasoline used.
     * @return The calculated fuel consumption.
     */
    public static double CalculateStaticConsumption(int km, int gasolinePercentage) {
        return km / (staticTankCapacity * (gasolinePercentage / 100.0));
    }

    // Getter for car type
    public CarType getType() {
        return type;
    }

    // Adds a wheel to the car's wheel array
    public void addWheel(Wheel wheel) {
        wheels[wheelIndex++] = wheel;
    }

    /**
     * Simulates accelerating the car.
     *
     * @param rpm The revolutions per minute.
     * @return A string representing the acceleration.
     */
    public String accelerate(int rpm) {
        return "The car " + maker + " accelerating at " + rpm + " RPM";
    }

    /**
     * Simulates braking the car.
     *
     * @return A string representing the braking action.
     */
    public String brake() {
        return maker + " " + model + " braking!";
    }

    /**
     * Simulates accelerating and braking the car.
     *
     * @param rpm The revolutions per minute.
     * @return A string representing the acceleration and braking sequence.
     */
    public String accelerateBrake(int rpm) {
        String accelerate = accelerate(rpm);
        String brake = brake();
        return accelerate + "\n" + brake;
    }

    /**
     * Calculates the fuel consumption based on distance and gasoline percentage.
     *
     * @param km                 The distance traveled in kilometers.
     * @param gasolinePercentage The percentage of gasoline used.
     * @return The calculated fuel consumption.
     */
    public double calculateConsumption(int km, int gasolinePercentage) {
        return km / (tank.getCapacity() * (gasolinePercentage / 100.0));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        return maker != null && model != null && maker.equals(car.maker) && model.equals(car.model);
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("id: " + id +
                "\nmaker: '" + maker + '\'' +
                "\nmodel: '" + model + '\'' +
                "\ntype: '" + type.getDescription() + '\'' +
                "\ncolor: '" + color + '\'' +
                "\npatentColor: '" + patentColor + '\'' +
                "\nmotor: " + motor.displacement() +
                "\ndriver: " + driver);

        for (Wheel wheel : wheels) {
            detail.append("\n").append(wheel);
        }
        detail.append("\ntank: ").append(tank.getCapacity())
                .append("\nstaticTankCapacity: ").append(staticTankCapacity);

        return detail.toString();
    }

    @Override
    public int compareTo(Car c) {
        return maker.compareTo(c.maker);
    }
}
