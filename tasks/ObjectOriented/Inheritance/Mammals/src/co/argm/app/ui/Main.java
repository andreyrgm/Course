package co.argm.app.ui;

import co.argm.app.model.*;

import static java.lang.System.out;

/**
 * Clase principal que ejecuta el programa y muestra la información de los animales.
 */
public class Main {
    public static void main(String[] args) {

        // Crear instancias de los diferentes animales
        Mammal lion = new Lion(114.0, 20, 13.0, 80, "African Plains", 120, 250, 190);
        Mammal dog = new Dog(600, 3.5, "Black with white spots", "Plains bordering the savannah", 75, 90, 65);
        Mammal cheetah = new Cheetah(10.5, 115, "African Steppes", 80, 150, 72);
        Mammal tigre = new Tigre("Bengal", 12.0, 60, "Rainforest of Asia", 95, 180, 220);
        Mammal wolf = new Wolf(8, "Grey Wolf", 4.5, "Gray", "Northern Forests", 85, 150, 60);

        // Mostrar la información de cada animal
        out.println(lion);
        out.println(lion.eat());
        out.println(lion.run());
        out.println(lion.sleep());
        out.println(lion.communicate());

        out.println("\n" + dog);
        out.println(dog.eat());
        out.println(dog.run());
        out.println(dog.sleep());
        out.println(dog.communicate());

        out.println("\n" + cheetah);
        out.println(cheetah.eat());
        out.println(cheetah.run());
        out.println(cheetah.sleep());
        out.println(cheetah.communicate());

        out.println("\n" + tigre);
        out.println(tigre.eat());
        out.println(tigre.run());
        out.println(tigre.sleep());
        out.println(tigre.communicate());

        out.println("\n" + wolf);
        out.println(wolf.eat());
        out.println(wolf.run());
        out.println(wolf.sleep());
        out.println(wolf.communicate());
    }
}
