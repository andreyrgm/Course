package co.argm.app.model.repo;

import co.argm.app.model.Category;
import co.argm.app.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

/**
 * Repositorio para la gestión de productos en la base de datos.
 */
public class ProductRepo implements Repo<Product> {
    private Connection conn;

    public ProductRepo() {
    }

    public ProductRepo(Connection conn) {
        this.conn = conn;
    }

    /**
     * Crea una instancia de Producto a partir de un ResultSet.
     *
     * @param rs El ResultSet obtenido de la consulta.
     * @return La instancia de Producto.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    private static Product create(ResultSet rs) throws SQLException {
        return new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("price"),
                new Category(rs.getInt("category_id"), rs.getString("category"))
        );
    }

    @Override
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * Recupera todos los productos de la base de datos.
     *
     * @return Lista de productos.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    @Override
    public List<Product> findAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT p.*, c.name AS category FROM products AS p " +
                "INNER JOIN categories AS c ON p.category_id = c.id";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                products.add(create(rs));
            }
        }
        return products;
    }

    /**
     * Busca un producto por su ID.
     *
     * @param id El ID del producto.
     * @return El producto encontrado o null si no existe.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    @Override
    public Product byId(int id) throws SQLException {
        Product product = null;
        String sql = "SELECT p.*, c.name AS category FROM products AS p " +
                "INNER JOIN categories AS c ON p.category_id = c.id WHERE p.id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = create(rs);
                }
            }
        }
        return product;
    }

    /**
     * Guarda un producto en la base de datos. Si el ID es mayor a 0, se actualiza,
     * de lo contrario, se inserta un nuevo producto.
     *
     * @param product El producto a guardar.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    @Override
    public void save(Product product) throws SQLException {
        String sql = product.getId() > 0 ?
                "UPDATE products SET name = ?, price = ?, category_id = ?, sku = ? WHERE id = ?" :
                "INSERT INTO products (name, price, category_id, sku, record_date) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql, RETURN_GENERATED_KEYS)) {
            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getPrice());
            stmt.setInt(3, product.getCategory().getId());
            stmt.setString(4, product.getSku());

            if (product.getId() > 0) {
                stmt.setInt(5, product.getId());
            } else {
                stmt.setDate(5, new Date(product.getRecordDate().getTime()));
            }

            stmt.executeUpdate();

            if (product.getId() == 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        product.setId(rs.getInt(1));
                    }
                }
            }
        }
    }

    /**
     * Elimina un producto por su ID.
     *
     * @param id El ID del producto a eliminar.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM products WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
