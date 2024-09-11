package co.argm.app.model;

import java.util.Objects;

public class CartItem {
    private final Product product;
    private int quantity;

    public CartItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getTotalPrice() {
        return quantity * product.price();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(product.id(), cartItem.product.id())
                && Objects.equals(product.name(), cartItem.product.name());
    }
}
