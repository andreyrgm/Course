package co.argm.app;

/**
 * Clase principal para crear un archivo y escribir en él utilizando el servicio de manejo de archivos.
 */
public class CreateFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\andre\\OneDrive\\Escritorio\\Course\\Modules\\Introduction\\Fundamentals\\" +
                "Console\\FileManagement\\src\\co\\argm\\app\\file\\file.txt";  // Ruta del archivo

        Service service = new Service();
        service.create(fileName);
    }
}
