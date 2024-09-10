package co.argm.app.app;

import java.util.Objects;

/**
 * Clase que representa un ítem en el carrito de compras.
 */
public class ItemCart {

    private final Product product;
    private int amount;

    public ItemCart(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return amount * product.price();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemCart itemCart)) return false;
        return Objects.equals(product.id(), itemCart.product.id()) && Objects.equals(product.name(), itemCart.product.name());
    }
}
