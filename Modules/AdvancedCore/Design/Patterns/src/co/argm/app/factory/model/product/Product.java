package co.argm.app.factory.model.product;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Clase abstracta que representa un producto de pizza.
 * Define las operaciones básicas que puede realizar una pizza.
 */
public abstract class Product {
    protected String name;
    protected String dough;
    protected String sauce = "Ketchup";
    protected List<String> ingredients;

    protected Product() {
        ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    /**
     * Prepara la pizza mostrando su nombre, el tipo de masa, la salsa y los ingredientes.
     */
    public void prepare() {
        out.println("Preparing " + name + "\nSelecting the dough " + dough + "\nAdding sauce " + sauce +
                "\nAdding ingredients: " + ingredients);
        ingredients.forEach(out::println);
    }

    /**
     * Método abstracto para cocinar la pizza.
     */
    public abstract void cook();

    /**
     * Método abstracto para cortar la pizza.
     */
    public abstract void cut();

    /**
     * Empaqueta la pizza en una caja.
     */
    public void pack() {
        out.println("Putting the pizza in a packing box...");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
