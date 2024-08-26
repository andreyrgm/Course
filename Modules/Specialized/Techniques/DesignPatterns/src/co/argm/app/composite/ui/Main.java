package co.argm.app.composite.ui;

import co.argm.app.composite.model.Directory;
import co.argm.app.composite.model.File;

import static java.lang.System.out;

/**
 * Clase principal para demostrar la estructura compuesta de archivos y directorios.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una estructura de directorios y archivos
        Directory stream = new Directory("Api Stream");
        stream.addComponent(new File("stream-map.docx"));

        Directory java = new Directory("Java");
        java.addComponent(new File("composite-pattern.docx")).addComponent(stream);

        Directory doc = new Directory("Documents");
        doc.addComponent(java).addComponent(new File("cv.docx")).addComponent(new File("logo.jpeg"));

        // Mostrar la estructura del directorio
        out.println(doc.show(0));

        // Buscar archivos y directorios en la estructura
        boolean found = doc.search("composite-pattern.docx");
        out.println("Found composite-pattern.docx: " + found);

        found = doc.search("Api Stream");
        out.println("Found Api Stream: " + found);

        found = doc.search("cv.docx");
        out.println("Found cv.docx: " + found);
    }
}
