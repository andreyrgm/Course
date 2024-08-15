package co.argm.app.model.form;

import co.argm.app.model.validator.Default;
import co.argm.app.model.validator.message.Formattable;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa un elemento de formulario HTML.
 */
public abstract class Item {
    private final List<Default> validators;
    private final List<String> errors;
    protected String name;
    protected String value;

    public Item(String name) {
        this.name = name;
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public Item(String name, String value) {
        this(name);
        this.value = value;
    }

    public Item addValidator(Default validator) {
        this.validators.add(validator);
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    /**
     * Verifica si el elemento es válido según los validadores asignados.
     *
     * @return true si es válido, false de lo contrario.
     */
    public boolean isValid() {
        for (Default validator : validators) {
            if (!validator.isValid(value)) {
                if (validator instanceof Formattable) {
                    errors.add(((Formattable) validator).getFormattedMessage(name));
                } else {
                    errors.add(String.format(validator.getMessage(), name));
                }
            }
        }
        return errors.isEmpty();
    }

    /**
     * Método abstracto para generar el código HTML del elemento.
     *
     * @return Código HTML del elemento.
     */
    public abstract String drawHtml();
}
