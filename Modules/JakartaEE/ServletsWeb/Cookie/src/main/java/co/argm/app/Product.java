package co.argm.app;

/**
 * Clase que representa un producto.
 *
 * @param id    el ID del producto
 * @param name  el nombre del producto
 * @param type  el tipo del producto
 * @param price el precio del producto
 */
public record Product(Integer id, String name, String type, Double price) {
}
