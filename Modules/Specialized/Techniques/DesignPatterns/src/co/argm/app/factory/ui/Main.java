package co.argm.app.factory.ui;

import co.argm.app.factory.model.pizzeria.California;
import co.argm.app.factory.model.pizzeria.NewYork;
import co.argm.app.factory.model.pizzeria.Pizzeria;

import static java.lang.System.out;

/**
 * Clase principal para probar la creación y pedido de pizzas de diferentes pizzerías.
 */
public class Main {
    public static void main(String[] args) {
        Pizzeria california = new California();
        Pizzeria newYork = new NewYork();

        out.println("Bruce orders " + california.orderPizza("cheese"));
        out.println("Andres orders " + newYork.orderPizza("pepperoni"));
        out.println("James orders " + california.orderPizza("vegetarian"));
        out.println("Linus orders " + newYork.orderPizza("vegetarian"));
        out.println("John orders " + california.orderPizza("pepperoni"));
        out.println("Pizza = " + newYork.orderPizza("italian").toString());
    }
}
