package co.argm.app.model.repo;

import co.argm.app.model.Category;
import co.argm.app.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static co.argm.app.model.util.Connect.getInstance;

public class ProductRepo implements Repo<Product> {
    private static Product create(ResultSet rs) throws SQLException {
        return new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("price"),
                rs.getDate("record_date"), new Category(rs.getInt("category_id"),
                rs.getString("category")));
    }

    private Connection getConnection() throws SQLException {
        return getInstance();
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select p.*, c.name as category from products as p inner join " +
                     "categories as c on p.category_id = c.id")) {

            while (rs.next()) {
                products.add(create(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public Product byId(int id) {
        Product product = null;
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("select p.*, c.name as category from " +
                     "products as p inner join categories as c on p.category_id = c.id where p.id = ?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = create(rs);
                }
            }
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public void save(Product product) {
        String sql;
        if (product.getId() > 0) {
            sql = "update products set name = ?, price = ?, category_id = ? where id = ?";
        } else {
            sql = "insert into products (name, price, category_id, record_date) values (?, ?, ?, ?)";
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
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("delete from products where id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}