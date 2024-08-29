package co.argm.app;

import static java.lang.System.out;

/**
 * Clase principal para leer el contenido de un archivo utilizando el servicio de manejo de archivos.
 */
public class ReadFile {
    public static void main(String[] args) {
        Service service = new Service();
        String content = service.read("C:\\Users\\andre\\OneDrive\\Escritorio\\Course\\Modules\\Introduction\\" +
                "Fundamentals\\Console\\FileManagement\\src\\co\\argm\\app\\file\\file.txt");  // Ruta del archivo
        out.println(content);
    }
}
