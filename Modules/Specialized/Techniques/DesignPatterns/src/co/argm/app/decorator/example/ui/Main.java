package co.argm.app.decorator.example.ui;

import co.argm.app.decorator.example.model.Coffee;
import co.argm.app.decorator.example.model.Configurable;
import co.argm.app.decorator.example.model.decorator.WithChocolate;
import co.argm.app.decorator.example.model.decorator.WithCream;
import co.argm.app.decorator.example.model.decorator.WithMilk;

import static java.lang.System.out;

/**
 * Clase principal para demostrar la funcionalidad del patrón Decorator.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un café Mocha y añadirle ingredientes adicionales
        Configurable coffee = new Coffee("Mocha Coffee", 7);
        WithCream withCream = new WithCream(coffee);
        WithMilk withMilk = new WithMilk(withCream);
        WithChocolate withChocolate = new WithChocolate(withMilk);
        out.println("The price of the mocha is " + withChocolate.getBasePrice());
        out.println("The ingredients: " + withChocolate.getIngredients());

        // Crear un café Cappuccino y añadirle ingredientes adicionales
        Configurable cappuccino = new Coffee("Cappuccino Coffee", 4);
        withCream = new WithCream(cappuccino);
        withMilk = new WithMilk(withCream);
        out.println("The price of the cappuccino is " + withMilk.getBasePrice());
        out.println("The ingredients: " + withMilk.getIngredients());

        // Crear un café Espresso sin ingredientes adicionales
        Configurable espresso = new Coffee("Espresso Coffee", 3);
        out.println("The price of the espresso is " + espresso.getBasePrice());
        out.println("The ingredients: " + espresso.getIngredients());
    }
}
