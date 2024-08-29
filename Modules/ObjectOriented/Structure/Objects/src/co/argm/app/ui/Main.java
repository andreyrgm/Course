package co.argm.app.ui;

import co.argm.app.model.*;
import co.argm.app.model.type.CarType;
import co.argm.app.model.type.Color;
import co.argm.app.model.type.MotorType;

import java.util.Arrays;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[5];
        Car subaru = new Car("Subaru", "WRX", Color.WHITE, new Motor(2, MotorType.BENCINA),
                CarType.HATCHBACK, new Tank(), new Person("Lucy", "Martinez"));
        for (int i = 0; i < wheels.length; i++) {
            subaru.addWheel(new Wheel("Yokohama", 16, 7.5));
        }
        out.println(subaru);
        out.println(subaru.accelerate(3000));
        out.println("Kilometers per liter: " + subaru.calculateConsumption(300, 60) + "\n");

        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Motor(3, MotorType.DIESEL),
                CarType.PICKUP, new Tank(45), new Person("Pato", "Rodriguez"));
        for (int i = 0; i < wheels.length; i++) {
            mazda.addWheel(new Wheel("Michelin", 18, 10.5));
        }
        out.println(mazda);
        out.println(mazda.accelerateBrake(4000));
        out.println("Kilometers per liter: " + mazda.calculateConsumption(300, 60) + "\n");

        Car nissan = new Car("Nissan", "GTR", Color.GREY, new Motor(4, MotorType.DIESEL),
                CarType.PICKUP, new Tank(50), new Person("Bea", "Rodriguez"));
        for (int i = 0; i < wheels.length; i++) {
            nissan.addWheel(new Wheel("Pirelli", 20, 11.5));
        }
        out.println(nissan);
        out.println("Kilometers per liter: " + nissan.calculateConsumption(300, 60));

        Car suzuki = new Car("Suzuki", "Swift", Color.YELLOW, new Motor(1.6, MotorType.BENCINA),
                CarType.SUV, new Tank(50), new Person("Lilo", "Mena"));
        for (int i = 0; i < wheels.length; i++) {
            suzuki.addWheel(new Wheel("Pirelli", 20, 11.5));
        }
        out.println(suzuki);
        out.println("They are equal? " + (nissan == suzuki));
        out.println("Are they equal with equals? " + nissan.equals(suzuki) + "\n");

        Car.setPatentColor(Color.BLUE);
        Car.setStaticTankCapacity(45);
        out.println("Kilometers per liter: " + Car.CalculateStaticConsumption(300, 60));

        Car[] cars = new Car[4];
        cars[0] = subaru;
        cars[1] = mazda;
        cars[2] = nissan;
        cars[3] = suzuki;

        Arrays.sort(cars);
        for (Car car : cars) {
            out.println(car);
        }

        out.println("Maximum road speed: " + Car.MAX_ROAD_SPEED);
        out.println("Maximum city speed: " + Car.MAX_CITY_SPEED);

        CarType subaruType = subaru.getType();
        switch (subaruType) {
            case CONVERTIBLE -> out.println("It is a two-door convertible sports car.");
            case COUPE -> out.println("It is a small two-door and typically sporty car.");
            case VAN -> out.println("It is a utility car for business transportation.");
            case HATCHBACK -> out.println("It is a compact medium car with a sporty appearance.");
            case PICKUP -> out.println("It is a double cabin car or truck.");
            case SEDAN -> out.println("It is a medium car.");
            case STATION_WAGON -> out.println("It's a bigger car with a big warehouse...");
            default -> out.println("Unknown car type.");
        }

        CarType[] types = CarType.values();
        for (CarType type : types) {
            out.print(type + " => " + type.name() + ", " +
                    type.getName() + ", " +
                    type.getDescription() + ", " +
                    type.getNumDoors() + "\n");
        }
    }
}
