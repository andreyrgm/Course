public class Method {
    public static void main(String[] args) {
        String name = "Andrey";

        // Métodos de la clase String
        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Andrey\") = " + name.equals("Andrey"));
        System.out.println("name.equals(\"andrey\") = " + name.equals("andrey"));
        System.out.println("name.equalsIgnoreCase(\"andrey\") = " + name.equalsIgnoreCase("andrey"));
        System.out.println("name.compareTo(\"Andrey\") = " + name.compareTo("Andrey"));
        System.out.println("name.compareTo(\"Aaron\") = " + name.compareTo("Aaron"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(1) = " + name.charAt(1));
        System.out.println("name.charAt(name.length() - 1) = " + name.charAt(name.length() - 1));

        // Métodos de substring
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1, 4) = " + name.substring(1, 4));
        System.out.println("name.substring(name.length() - 2) = " + name.substring(name.length() - 2));

        String tongueTwister = "tongue twister";

        // Métodos de reemplazo e indexación
        System.out.println("tongueTwister.replace(\"t\", \".\") = " + tongueTwister.replace("t", "."));
        System.out.println("tongueTwister = " + tongueTwister);
        System.out.println("tongueTwister.indexOf('e') = " + tongueTwister.indexOf('e'));
        System.out.println("tongueTwister.lastIndexOf('e') = " + tongueTwister.lastIndexOf('e'));
        System.out.println("tongueTwister.indexOf(\"twister\") = " + tongueTwister.indexOf("twister"));

        // Contiene, comienza con, termina con los métodos
        System.out.println("tongueTwister.contains(\"twister\") = " + tongueTwister.contains("twister"));
        System.out.println("tongueTwister.startsWith(\"to\") = " + tongueTwister.startsWith("to"));
        System.out.println("tongueTwister.endsWith(\"r\") = " + tongueTwister.endsWith("r"));

        // Método de recorte
        System.out.println("\"  tongue twister \"");
        System.out.println("\"  tongue twister \".trim() = " + "  tongue twister ".trim());
    }
}
