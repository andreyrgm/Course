import java.util.Scanner;

/**
 * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
 *
 * Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter, pero convertido en mayúscula
 * y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo, para Andres debe quedar como N.es
 *
 * Debe imprimir como resultado los tres nuevos nombres separados con guion bajo (como una única variable).
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write three names, they can be family or friends.");
        System.out.println("first name");
        String name1 = sc.nextLine();
        System.out.println("second name");
        String name2 = sc.nextLine();
        System.out.println("third name");
        String name3 = sc.nextLine();
        sc.close();
        String n1 = name1.toUpperCase().charAt(1) + "." + name1.substring(name1.length() - 2);
        String n2 = name2.toUpperCase().charAt(1) + "." + name2.substring(name2.length() - 2);
        String n3 = name3.toUpperCase().charAt(1) + "." + name3.substring(name3.length() - 2);
        System.out.println(n1 + "_" + n2 + "_" + n3);
    }
}
