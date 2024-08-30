package co.argm.app.decorator.example.model;

/**
 * Interfaz que define los métodos para obtener el precio base y los ingredientes de un café.
 */
public interface Configurable {
    double getBasePrice();

    String getIngredients();
}
