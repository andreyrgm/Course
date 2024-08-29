package co.argm.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Clase de servicio que proporciona métodos para crear y leer archivos.
 */
public class Service {

    /**
     * Crea un archivo con el nombre especificado y escribe contenido en él.
     *
     * @param name Nombre del archivo incluyendo la ruta completa.
     */
    public void create(String name) {
        File file = new File(name);

        // Crear los directorios padre si no existen
        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        // Escribir en el archivo
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            pw.println("Hi, how are you friends!");
            pw.println("All good? I'm here writing a file...");
            pw.printf("See you later %s!", "Lucas");
            out.println("The file has been created successfully!");
        } catch (IOException e) {
            throw new RuntimeException("Error creating the file: " + e.getMessage(), e);
        }
    }

    /**
     * Lee el contenido de un archivo y lo devuelve como un String.
     *
     * @param name Nombre del archivo incluyendo la ruta completa.
     * @return Contenido del archivo como String.
     */
    public String read(String name) {
        StringBuilder sb = new StringBuilder();
        File file = new File(name);

        // Leer el archivo
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading the file: " + e.getMessage(), e);
        }

        return sb.toString();
    }
}
