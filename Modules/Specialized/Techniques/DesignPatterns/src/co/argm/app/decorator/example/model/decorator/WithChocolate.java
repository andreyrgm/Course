package co.argm.app.decorator.example.model.decorator;

import co.argm.app.decorator.example.model.Configurable;

/**
 * Decorador que añade chocolate a un café.
 */
public class WithChocolate extends Abstract {
    public WithChocolate(Configurable coffee) {
        super(coffee);
    }

    @Override
    public double getBasePrice() {
        return coffee.getBasePrice() + 5;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Chocolate";
    }
}
