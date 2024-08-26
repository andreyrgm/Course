package co.argm.app.composite.model;

/**
 * Clase abstracta que define la interfaz común para todos los componentes
 * (archivos y directorios) en la estructura compuesta.
 */
public abstract class Component {
    protected String name;

    protected Component(String name) {
        this.name = name;
    }

    /**
     * Método abstracto que busca un componente por su nombre.
     *
     * @param name El nombre a buscar.
     * @return true si se encuentra el componente, false en caso contrario.
     */
    public abstract boolean search(String name);

    /**
     * Método abstracto que muestra la estructura del componente.
     *
     * @param level El nivel de indentación para mostrar la estructura.
     * @return La representación en cadena de la estructura.
     */
    public abstract String show(int level);
}
