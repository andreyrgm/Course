package co.argm.app.model.repo;

import co.argm.app.model.Category;
import co.argm.app.model.Product;
import co.argm.app.model.util.Connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio para realizar operaciones CRUD sobre productos en la base de datos.
 */
public class ProductRepo implements Repo<Product> {

    /**
     * Crea una instancia de Product a partir de un ResultSet.
     *
     * @param rs El ResultSet de donde se extraen los datos.
     * @return Un objeto Product con los datos extraídos.
     * @throws SQLException si ocurre un error al acceder a los datos del ResultSet.
     */
    private static Product create(ResultSet rs) throws SQLException {
        return new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("price"),
                rs.getDate("record_date"),
                new Category(rs.getInt("category_id"), rs.getString("category"))
        );
    }

    /**
     * Obtiene una conexión a la base de datos.
     *
     * @return Una conexión a la base de datos.
     * @throws SQLException si ocurre un error al intentar conectarse a la base de datos.
     */
    private Connection getConnection() throws SQLException {
        return Connect.getConnection();
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT p.*, c.name AS category FROM products AS p " +
                "INNER JOIN categories AS c ON p.category_id = c.id";

        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                products.add(create(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching all products", e);
        }
        return products;
    }

    @Override
    public Product byId(int id) {
        Product product = null;
        String sql = "SELECT p.*, c.name AS category FROM products AS p " +
                "INNER JOIN categories AS c ON p.category_id = c.id WHERE p.id = ?";

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = create(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching product by ID", e);
        }
        return product;
    }

    @Override
    public void save(Product product) {
        String sql;
        if (product.getId() > 0) {
            sql = "UPDATE products SET name = ?, price = ?, category_id = ? WHERE id = ?";
        } else {
            sql = "INSERT INTO products (name, price, category_id, record_date) VALUES (?, ?, ?, ?)";
        }

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getPrice());
            stmt.setInt(3, product.getCategory().getId());

            if (product.getId() > 0) {
                stmt.setInt(4, product.getId());
            } else {
                stmt.setDate(4, new Date(product.getRecordDate().getTime()));
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error saving product", e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM products WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting product", e);
        }
    }
}
