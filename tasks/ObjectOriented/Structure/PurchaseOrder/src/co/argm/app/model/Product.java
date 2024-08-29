package co.argm.app.model;

/**
 * Representa un producto con un fabricante, nombre y precio.
 */
public record Product(String maker, String name, int price) {
    /**
     * Constructor que inicializa un producto con su fabricante, nombre y precio.
     *
     * @param maker El fabricante del producto.
     * @param name  El nombre del producto.
     * @param price El precio del producto.
     */
    public Product {
    }

    /**
     * Obtiene el fabricante del producto.
     *
     * @return El fabricante del producto.
     */
    @Override
    public String maker() {
        return maker;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    @Override
    public String name() {
        return name;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    @Override
    public int price() {
        return price;
    }
}
