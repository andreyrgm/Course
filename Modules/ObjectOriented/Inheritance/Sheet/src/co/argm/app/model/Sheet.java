package co.argm.app.model;

/**
 * Clase abstracta que representa una hoja de contenido.
 * Puede ser extendida para diferentes tipos de documentos.
 */
public abstract class Sheet {
    protected String content;

    protected Sheet(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
