package co.argm.app.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Clase que representa un carrito de compras.
 */
public class Cart {

    private final List<ItemCart> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<ItemCart> getItems() {
        return items;
    }

    public void addItem(ItemCart item) {
        Optional<ItemCart> opt = items.stream().filter(i -> i.equals(item)).findAny();

        if (opt.isPresent()) {
            ItemCart existingItem = opt.get();
            existingItem.setAmount(existingItem.getAmount() + 1);
        } else {
            items.add(item);
        }
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(ItemCart::getQuantity).sum();
    }
}
