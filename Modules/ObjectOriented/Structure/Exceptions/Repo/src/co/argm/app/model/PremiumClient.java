package co.argm.app.model;

/**
 * Clase que representa un cliente premium.
 */
public class PremiumClient extends Client implements Comparable<PremiumClient> {
    public PremiumClient(String name, String surname) {
        super(name, surname);
    }

    @Override
    public int compareTo(PremiumClient o) {
        return 0; // Implementar la lógica de comparación si es necesario.
    }
}
