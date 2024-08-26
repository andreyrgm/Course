package co.argm.app.composite.model;

/**
 * Clase que representa un archivo dentro de un directorio.
 */
public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public String show(int level) {
        return "\t".repeat(level) + name;
    }

    @Override
    public boolean search(String name) {
        return this.name.equalsIgnoreCase(name);
    }
}
