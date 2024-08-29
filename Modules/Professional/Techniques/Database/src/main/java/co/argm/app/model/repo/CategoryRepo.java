package co.argm.app.model.repo;

import co.argm.app.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

/**
 * Repositorio para la gestión de categorías en la base de datos.
 */
public class CategoryRepo implements Repo<Category> {
    private Connection conn;

    @Override
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Category> findAll() throws SQLException {
        List<Category> categories = new ArrayList<>();
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM categories")) {
            while (rs.next()) {
                categories.add(new Category(rs.getInt("id"), rs.getString("name")));
            }
        }
        return categories;
    }

    @Override
    public Category byId(int id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM categories WHERE id = ?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Category(rs.getInt("id"), rs.getString("name"));
                }
            }
        }
        return null;
    }

    @Override
    public void save(Category category) throws SQLException {
        String sql = category.getId() > 0 ?
                "UPDATE categories SET name = ? WHERE id = ?" :
                "INSERT INTO categories (name) VALUES (?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql, RETURN_GENERATED_KEYS)) {
            stmt.setString(1, category.getName());

            if (category.getId() > 0) {
                stmt.setInt(2, category.getId());
            }

            stmt.executeUpdate();

            if (category.getId() == 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        category.setId(rs.getInt(1));
                    }
                }
            }
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM categories WHERE id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
