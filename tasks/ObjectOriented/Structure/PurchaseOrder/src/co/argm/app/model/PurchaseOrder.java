package co.argm.app.model;

import java.util.Date;

/**
 * Representa una orden de compra con una descripción, productos y cliente asociado.
 */
public class PurchaseOrder {
    private static int lastId;
    private final int id;
    private final String description;
    private final Product[] products;
    private Date date;
    private Client client;
    private int productIndex;

    /**
     * Constructor que inicializa una orden de compra con una descripción.
     *
     * @param description La descripción de la orden de compra.
     */
    public PurchaseOrder(String description) {
        this.description = description;
        this.id = ++lastId;
        this.products = new Product[4];
    }

    /**
     * Obtiene el identificador único de la orden de compra.
     *
     * @return El identificador de la orden de compra.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene la descripción de la orden de compra.
     *
     * @return La descripción de la orden de compra.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Obtiene la fecha de la orden de compra.
     *
     * @return La fecha de la orden de compra.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Establece la fecha de la orden de compra.
     *
     * @param date La fecha a establecer.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Obtiene el cliente asociado a la orden de compra.
     *
     * @return El cliente asociado.
     */
    public Client getClient() {
        return client;
    }

    /**
     * Establece el cliente asociado a la orden de compra.
     *
     * @param client El cliente a establecer.
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Obtiene el arreglo de productos en la orden de compra.
     *
     * @return El arreglo de productos.
     */
    public Product[] getProducts() {
        return products;
    }

    /**
     * Añade un producto a la orden de compra.
     *
     * @param product El producto a añadir.
     */
    public void addProduct(Product product) {
        if (productIndex < this.products.length) {
            this.products[productIndex++] = product;
        }
    }

    /**
     * Calcula el total de la orden de compra sumando los precios de todos los productos.
     *
     * @return El total de la orden de compra.
     */
    public int getGrandTotal() {
        int total = 0;
        for (Product p : products) {
            total += p.price();
        }
        return total;
    }
}
