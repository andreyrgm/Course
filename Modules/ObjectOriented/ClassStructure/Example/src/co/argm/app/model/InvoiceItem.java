package co.argm.app.model;

/**
 * Representa un item en una factura, que consiste en un producto y una cantidad.
 */
public class InvoiceItem {
    private final Product product;
    private final int amount;

    public InvoiceItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    /**
     * Calcula el monto total del item multiplicando el precio del producto por la cantidad.
     *
     * @return El monto total del item.
     */
    public double calculateAmount() {
        return amount * product.getPrice();
    }

    @Override
    public String toString() {
        return product + "\t" + amount + "\t" + calculateAmount();
    }
}
