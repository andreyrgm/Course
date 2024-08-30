package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase `Component` representa un componente de un sistema jerárquico, como un PC con componentes anidados.
 */
public class Component {
    private final String name;
    private final List<Component> children;
    private int level;

    public Component(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Component> getChildren() {
        return children;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Component addComponent(Component component) {
        children.add(component);
        return this;
    }
}
