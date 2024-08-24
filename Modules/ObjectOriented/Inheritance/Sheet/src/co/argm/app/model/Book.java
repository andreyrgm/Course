package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un libro compuesto de varias páginas (Sheet).
 * Cada libro tiene un autor, un título y un género.
 */
public class Book {
    private final List<Sheet> pages;
    private final Person author;
    private final String title;
    private final Genre genre;

    public Book(Person author, String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Sheet page) {
        pages.add(page);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Title: ").append(title)
                .append("\nAuthor: ").append(author)
                .append("\nGenre: ").append(genre);
        for (Sheet sheet : pages) {
            sb.append("\n").append(sheet);
        }
        return sb.toString();
    }
}
