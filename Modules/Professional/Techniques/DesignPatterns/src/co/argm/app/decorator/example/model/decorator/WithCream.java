package co.argm.app.decorator.example.model.decorator;

import co.argm.app.decorator.example.model.Configurable;

/**
 * Decorador que añade crema a un café.
 */
public class WithCream extends Abstract {
    public WithCream(Configurable coffee) {
        super(coffee);
    }

    @Override
    public double getBasePrice() {
        return coffee.getBasePrice() + 2.5;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Cream";
    }
}
