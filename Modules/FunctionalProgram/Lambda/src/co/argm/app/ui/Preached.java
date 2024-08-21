package co.argm.app.ui;

import co.argm.app.model.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static java.lang.System.*;

/**
 * Clase que demuestra el uso de predicados en expresiones lambda.
 */
public class Preached {
    public static void main(String[] args) {

        // Predicado que verifica si un número es mayor que 10.
        Predicate<Integer> test = num -> num > 10;
        out.println(test.test(11));

        // Predicado que verifica si un rol es "ROLE_ADMIN".
        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        out.println(test2.test("ROLE_ADMIN"));

        // BiPredicate que compara dos cadenas de texto.
        BiPredicate<String, String> test3 = String::equals;
        out.println(test3.test("Andrey", "Andrey"));

        // BiPredicate que verifica si un número es mayor que otro.
        BiPredicate<Integer, Integer> test4 = (num1, num2) -> num1 > num2;
        out.println(test4.test(5, 10));

        // BiPredicate que compara los nombres de dos usuarios.
        User a = new User("Maria");
        User b = new User("Cata");
        BiPredicate<User, User> test5 = (ua, ub) -> ua.getName().equals(ub.getName());
        out.println(test5.test(a, b));
    }
}
