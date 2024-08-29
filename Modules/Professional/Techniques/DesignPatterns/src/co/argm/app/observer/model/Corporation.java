package co.argm.app.observer.model;

/**
 * Clase que representa una corporación que puede notificar a sus observadores sobre cambios en su precio.
 */
public class Corporation extends Observable {
    private final String name;
    private int price;

    public Corporation(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Modifica el precio de la corporación y notifica a los observadores.
     *
     * @param price Nuevo precio de la corporación.
     */
    public void modifyPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return name + " new price " + price + "$";
    }
}
