package co.argm.app.factory.model.pizzeria;

import co.argm.app.factory.model.product.Product;

import static java.lang.System.out;

/**
 * Clase abstracta que representa una pizzería.
 * Define el proceso para pedir una pizza y delega la creación de la pizza a las subclases.
 */
public abstract class Pizzeria {

    /**
     * Método para ordenar una pizza del tipo especificado.
     *
     * @param type Tipo de pizza.
     * @return La pizza preparada.
     */
    public Product orderPizza(String type) {
        Product pizza = createPizza(type);
        if (pizza != null) {
            out.println("--- Making the pizza " + pizza.getName() + " ---");
            pizza.prepare();
            pizza.cook();
            pizza.cut();
            pizza.pack();
        } else {
            out.println("Sorry, we don't have a pizza of type: " + type);
        }
        return pizza;
    }

    /**
     * Método abstracto para crear una pizza del tipo especificado.
     *
     * @param type Tipo de pizza.
     * @return La pizza creada.
     */
    abstract Product createPizza(String type);
}
