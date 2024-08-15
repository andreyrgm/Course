package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final List<Sheet> pages;
    private final Person author;
    private final String title;
    private final Genre genre;

    public Book(Person author, String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        pages = new ArrayList<Sheet>();
    }

    public Book addPage(Sheet page) {
        pages.add(page);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Title: ").append(title).append("\n").append("Author: ").
                append(author).append("\n").append("Genre: ").append(genre);
        for (Sheet sheet : pages) {
            sb.append(sheet).append("\n");
        }
        return sb.toString();
    }
}
