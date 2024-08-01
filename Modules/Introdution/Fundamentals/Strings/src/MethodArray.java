import static java.lang.System.*;

/**
 * Ejemplo de uso de métodos de la clase String y manejo de arreglos de caracteres en Java.
 */
public class MethodArray {
    public static void main(String[] args) {

        out.println("Example 1: Converting a string to a character array");
        String tongueTwister = "tongue twister";
        out.println("Length of 'tongueTwister': " + tongueTwister.length());
        out.println("Character array: " + tongueTwister.toCharArray());

        char[] array = tongueTwister.toCharArray();
        int length = array.length;
        out.println("Array size: " + length);
        out.print("Array content: ");
        for (char c : array) {
            out.print(c);
        }
        out.println();

        out.println("\nExample 2: Splitting a String Using a Delimiter");
        out.println("\nDivision of 'tongueTwister' by 'e': ");
        String[] array2 = tongueTwister.split("e");
        for (String part : array2) {
            out.println(part);
        }

        out.println("\nExample 3: Splitting a string with multiple delimiters");
        String file = "some.image.jsf";
        String[] fileArray = file.split("\\."); // dividir usando el carácter punto
        out.println("\nDivision of 'some.image.jsf' by '.'");
        for (String s : fileArray) {
            out.println(s);
        }

        out.println("\nExample 4: Obtaining the extension of a file from its name");
        out.println("File extension: " + fileArray[fileArray.length - 1]);
    }
}
