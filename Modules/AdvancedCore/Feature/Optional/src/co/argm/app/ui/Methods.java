package co.argm.app.ui;

import java.util.Optional;

import static java.lang.System.out;
import static java.util.Optional.of;

/**
 * Clase principal que demuestra varios métodos de la clase Optional.
 */
public class Methods {
    public static void main(String[] args) {
        String name = "Andrew";
        Optional<String> opt = of(name);
        out.println("opt = " + opt);
        out.println("Are you present? " + opt.isPresent());
        opt.ifPresent(s -> out.println("hi " + s));

        out.println("Is it empty? " + opt.isEmpty());

        name = "John";
        opt = of(name);
        out.println("opt = " + opt);
        out.println("Are you present? " + opt.isPresent());
        out.println("Is it empty? " + opt.isEmpty());

        opt.ifPresentOrElse(val -> out.println("Hi " + val), () -> out.println("not present"));

        Optional<String> optEmpty = Optional.empty();
        out.println("opt = " + optEmpty);
        out.println("Are you present? " + optEmpty.isPresent());
    }
}
