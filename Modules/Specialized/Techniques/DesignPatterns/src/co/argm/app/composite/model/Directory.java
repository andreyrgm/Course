package co.argm.app.composite.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase que representa un directorio, que puede contener otros componentes (archivos o subdirectorios).
 */
public class Directory extends Component {
    private final List<Component> children;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }

    public Directory addComponent(Component component) {
        children.add(component);
        return this;
    }

    @Override
    public String show(int level) {
        StringBuilder sb = new StringBuilder("\t".repeat(level)).append(name).append("/").append("\n");
        for (Component component : children) {
            sb.append(component.show(level + 1));
            if (component instanceof File) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean search(String name) {
        if (this.name.equalsIgnoreCase(name)) {
            return true;
        }
        return children.stream().anyMatch(h -> h.search(name));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Component component)) return false;
        return Objects.equals(name, component.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
