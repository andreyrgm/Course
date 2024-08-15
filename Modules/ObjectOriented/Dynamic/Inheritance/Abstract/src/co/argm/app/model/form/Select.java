package co.argm.app.model.form;

import co.argm.app.model.form.select.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un elemento de tipo <select> en un formulario HTML.
 */
public class Select extends Item {
    private final List<Option> options;

    public Select(String name) {
        super(name);
        this.options = new ArrayList<>();
    }

    public Select addOption(Option option) {
        this.options.add(option);
        return this;
    }

    @Override
    public String drawHtml() {
        StringBuilder sb = new StringBuilder("<select ").append("name='").append(name).append("'>");
        for (Option option : options) {
            sb.append("\n<option value='").append(option.getValue()).append("'");
            if (option.isSelected()) {
                sb.append(" selected");
                value = option.getValue();
            }
            sb.append(">").append(option.getName()).append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
