package co.argm.app.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa un objeto observable que notifica a sus observadores sobre cambios.
 */
public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public Observable addObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    /**
     * Notifica a todos los observadores sin datos adicionales.
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * Notifica a todos los observadores con datos adicionales.
     *
     * @param obj Datos adicionales a enviar a los observadores.
     */
    public void notifyObservers(Object obj) {
        for (Observer observer : observers) {
            observer.update(this, obj);
        }
    }
}
