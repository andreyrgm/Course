package co.argm.app.model.service;

import co.argm.app.model.Category;
import co.argm.app.model.Product;
import co.argm.app.model.repo.CategoryRepo;
import co.argm.app.model.repo.ProductRepo;
import co.argm.app.model.repo.Repo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static co.argm.app.model.util.Connect.getConnection;

/**
 * Servicio para la gestión del catálogo de productos y categorías.
 */
public class ServiceCatalog implements Service {
    private final Repo<Product> productRepo;
    private final Repo<Category> categoryRepo;

    public ServiceCatalog() {
        productRepo = new ProductRepo();
        categoryRepo = new CategoryRepo();
    }

    @Override
    public List<Product> findAll() throws SQLException {
        try (Connection conn = getConnection()) {
            productRepo.setConn(conn);
            return productRepo.findAll();
        }
    }

    @Override
    public Product byId(int id) throws SQLException {
        try (Connection conn = getConnection()) {
            productRepo.setConn(conn);
            return productRepo.byId(id);
        }
    }

    @Override
    public Product save(Product product) throws SQLException {
        try (Connection conn = getConnection()) {
            productRepo.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                productRepo.save(product);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        }
        return product;
    }

    @Override
    public Category save(Category category) throws SQLException {
        try (Connection conn = getConnection()) {
            categoryRepo.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                categoryRepo.save(category);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        }
        return category;
    }

    @Override
    public void delete(int id) throws SQLException {
        try (Connection conn = getConnection()) {
            productRepo.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                productRepo.delete(id);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        }
    }
}
