package co.argm.app.Example;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa de autenticación básica que verifica si el usuario y la contraseña son válidos.
 */
public class LogicalLogin {
    public static void main(String[] args) {

        String[] usernames = {"andrey", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner sc = new Scanner(in);

        out.println("Enter the username:");
        String usernameInput = sc.nextLine();

        out.println("Enter the password:");
        String passwordInput = sc.nextLine();

        boolean isAuthenticated = false;
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(usernameInput) && passwords[i].equals(passwordInput)) {
                isAuthenticated = true;
                break;
            }
        }

        String message = isAuthenticated ?
                "Welcome user " + usernameInput + "!" :
                "Incorrect username or password!\nSorry, authentication required";
        out.println(message);
    }
}
