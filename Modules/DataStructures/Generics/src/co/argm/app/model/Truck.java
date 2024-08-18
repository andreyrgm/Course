package co.argm.app.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase genérica que representa un camión que transporta objetos de un tipo específico.
 *
 * @param <T> El tipo de objetos que el camión puede transportar.
 */
public class Truck<T> implements Iterable<T> {
    private final List<T> objects;
    private final int max;

    /**
     * Constructor para la clase Truck.
     *
     * @param max Capacidad máxima del camión.
     */
    public Truck(int max) {
        this.max = max;
        this.objects = new ArrayList<>();
    }

    /**
     * Añade un objeto al camión si hay espacio disponible.
     *
     * @param object El objeto a añadir.
     * @return Este camión, para permitir encadenamiento de métodos.
     * @throws RuntimeException Si el camión ha alcanzado su capacidad máxima.
     */
    public Truck<T> add(T object) {
        if (objects.size() < max) {
            objects.add(object);
        } else {
            throw new RuntimeException("There is no more space");
        }
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
    }
}
