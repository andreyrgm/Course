package co.argm.app.model;

import java.util.Objects;

/**
 * Clase que representa a un estudiante.
 */
public class Student {
    private final String name;
    private final Integer note;

    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public Integer getNote() {
        return note;
    }

    @Override
    public String toString() {
        return name + ", note=" + note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(note, student.note);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, note);
    }
}
