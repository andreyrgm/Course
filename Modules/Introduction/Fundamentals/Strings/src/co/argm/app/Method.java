package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de uso de métodos de la clase String en Java.
 */
public class Method {
    public static void main(String[] args) {

        String name = "Andrey";

        out.println("Example 1: Getting the length and changing case");
        out.println("name.length() = " + name.length());
        out.println("name.toUpperCase() = " + name.toUpperCase());
        out.println("name.toLowerCase() = " + name.toLowerCase());

        out.println("\nExample 2: String Comparison");
        out.println("name.equals(\"Andres\") = " + name.equals("Andres"));
        out.println("name.equals(\"andres\") = " + name.equals("andres"));
        out.println("name.equalsIgnoreCase(\"andres\") = " + name.equalsIgnoreCase("andres"));
        out.println("name.compareTo(\"Andres\") = " + name.compareTo("Andres"));
        out.println("name.compareTo(\"Aaron\") = " + name.compareTo("Aaron"));

        out.println("\nExample 3: Access to specific characters");
        out.println("name.charAt(0) = " + name.charAt(0));
        out.println("name.charAt(1) = " + name.charAt(1));
        out.println("name.charAt(name.length()-1) = " + name.charAt(name.length() - 1));

        out.println("\nExample 4: Substrings");
        out.println("name.substring(1) = " + name.substring(1));
        out.println("name.substring(1, 4) = " + name.substring(1, 4));
        out.println("name.substring(name.length()-2) = " + name.substring(name.length() - 2));

        String tongueTwister = "tongue twister";
        out.println("\nExample 5: Character replacement and search");
        out.println("tongueTwister.replace('e', '.') = " + tongueTwister.replace("e", "."));
        out.println("tongueTwister.indexOf('e') = " + tongueTwister.indexOf('e'));
        out.println("tongueTwister.lastIndexOf('e') = " + tongueTwister.lastIndexOf('e'));
        out.println("tongueTwister.indexOf(\"twister\") = " + tongueTwister.indexOf("twister"));
        out.println("tongueTwister.contains(\"twister\") = " + tongueTwister.contains("twister"));

        out.println("\nExample 6: Prefix and suffix verification");
        out.println("tongueTwister.startsWith(\"to\") = " + tongueTwister.startsWith("to"));
        out.println("tongueTwister.endsWith(\"r\") = " + tongueTwister.endsWith("r"));

        out.println("\nExample 7: Whitespace Removal");
        out.println("  tongueTwister ");
        out.println("  tongueTwister ".trim());
    }
}
