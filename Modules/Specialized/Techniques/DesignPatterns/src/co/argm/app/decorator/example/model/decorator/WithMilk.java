package co.argm.app.decorator.example.model.decorator;

import co.argm.app.decorator.example.model.Configurable;

/**
 * Decorador que añade leche a un café.
 */
public class WithMilk extends Abstract {
    public WithMilk(Configurable coffee) {
        super(coffee);
    }

    @Override
    public double getBasePrice() {
        return coffee.getBasePrice() + 3.7;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Milk";
    }
}
