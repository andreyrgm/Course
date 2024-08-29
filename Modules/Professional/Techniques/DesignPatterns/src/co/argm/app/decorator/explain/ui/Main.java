package co.argm.app.decorator.explain.ui;

import co.argm.app.decorator.explain.model.Formattable;
import co.argm.app.decorator.explain.model.Text;
import co.argm.app.decorator.explain.model.decorator.CapitalLetter;
import co.argm.app.decorator.explain.model.decorator.ReplaceSpace;
import co.argm.app.decorator.explain.model.decorator.Reverse;
import co.argm.app.decorator.explain.model.decorator.Underline;

import static java.lang.System.out;

/**
 * Clase principal para demostrar la funcionalidad del patrón Decorator.
 */
public class Main {
    public static void main(String[] args) {
        Formattable text = new Text("Hello, how are you, Andrew!");

        CapitalLetter capitalLetter = new CapitalLetter(text);
        Reverse reverse = new Reverse(capitalLetter);
        Underline underline = new Underline(reverse);
        ReplaceSpace replaceSpace = new ReplaceSpace(underline);
        out.println(replaceSpace.format());
    }
}
