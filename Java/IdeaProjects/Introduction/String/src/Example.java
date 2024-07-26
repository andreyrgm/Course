public class Example {
    public static void main(String[] args) {
        // Nombre del archivo con extensión
        String archive = "any.image.png";

        // Encuentra el índice del último punto en el nombre del archivo
        int i = archive.lastIndexOf(".");

        // Imprime la longitud total del nombre del archivo
        System.out.println("archive.length() = " + archive.length());

        // Imprime la extensión del archivo (subcadena desde el carácter después del último punto hasta el final)
        System.out.println("archive.substring(i + 1) = " + archive.substring(i + 1));
    }
}
