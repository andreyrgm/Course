package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart {
    private final List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem cartItem) {
        if (items.contains(cartItem)) {
            Optional<CartItem> optionalCartItem = items.stream().filter(i -> i.equals(cartItem)).findAny();
            optionalCartItem.ifPresent(item -> item.setQuantity(item.getQuantity() + 1));
        } else this.items.add(cartItem);
    }

    public List<CartItem> getItems() {
        return items;
    }

    public int getTotal() {
        return items.stream().mapToInt(CartItem::getTotalPrice).sum();
    }

    public void removeProducts(List<String> productIds) {
        if (productIds != null) {
            productIds.forEach(this::removeProduct);
        }
    }

    public void removeProduct(String productId) {
        Optional<CartItem> product = findProduct(productId);
        product.ifPresent(cartItem -> items.remove(cartItem));
    }

    public void updateQuantity(String productId, int quantity) {
        Optional<CartItem> product = findProduct(productId);
        product.ifPresent(cartItem -> cartItem.setQuantity(quantity));
    }

    private Optional<CartItem> findProduct(String productId) {
        return items.stream()
                .filter(cartItem -> productId.equals(Long.toString(cartItem.getProduct().id())))
                .findAny();
    }
}
