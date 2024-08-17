package co.argm.app.ui;

import co.argm.app.model.Animal;
import co.argm.app.model.Car;
import co.argm.app.model.Machinery;
import co.argm.app.model.Truck;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        // Creando un camión para transportar caballos
        Truck<Animal> horseTransport = new Truck<>(5);
        for (String s : Arrays.asList("A", "C", "B", "D", "E")) {
            horseTransport.add(new Animal(s, "Horse"));
        }
        for (Animal a : horseTransport) {
            out.println(a);
        }

        // Creando un camión para transportar maquinaria
        Truck<Machinery> machineryTransport = new Truck<>(3);
        machineryTransport.add(new Machinery("Bulldozer"));
        machineryTransport.add(new Machinery("Fork Crane"));
        machineryTransport.add(new Machinery("Drill"));
        for (Machinery m : machineryTransport) {
            out.println(m);
        }

        // Creando un camión para transportar coches
        Truck<Car> carTransport = new Truck<>(3);
        carTransport.add(new Car("Toyota"));
        carTransport.add(new Car("BMW"));
        carTransport.add(new Car("Ford"));
        for (Car c : carTransport) {
            out.println(c);
        }
    }
}
