import java.util.Scanner;

public class ExampleLogin {
    public static void main(String[] args) {
        // Definición de los arrays de usuarios y contraseñas
        String[] usernames = {"andrew", "pepe", "admin"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre de usuario y contraseña
        System.out.print("Enter your username: ");
        String user = sc.nextLine();
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();

        boolean isAuthenticated = false;

        // Comprobación de las credenciales usando un bucle y el operador ternario
        for (int i = 0; i < usernames.length; i++) {
            isAuthenticated = user.equals(usernames[i]) && pass.equals(passwords[i]) || isAuthenticated;
        }

        // Mensaje de resultado basado en la autenticación
        String message = isAuthenticated ? "Welcome user " + user + "!" : "Invalid username or password!\nSorry, authentication required";
        System.out.println(message);
    }
}
