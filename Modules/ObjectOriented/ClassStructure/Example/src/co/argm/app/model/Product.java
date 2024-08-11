package co.argm.app.model;

/**
 * Representa un producto con un nombre y un precio.
 */
public class Product {
    private static int lastId;
    private final int id;
    private String name;
    private double price;

    public Product() {
        id = ++lastId;
    }

    /**
     * Obtiene el ID del producto.
     *
     * @return El ID del producto.
     */
    public int getId() {
        return id;
    }


    /**
     * Establece el nombre del producto.
     *
     * @param name El nuevo nombre del producto.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del producto.
     *
     * @param price El nuevo precio del producto.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + price;
    }
}
