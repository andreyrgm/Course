package co.argm.app.controller;

import co.argm.app.Product;
import co.argm.app.service.ProductService;
import co.argm.app.service.ProductServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet que gestiona los productos en formato JSON.
 */
@WebServlet("/products-json")
public class ProductJson extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletInputStream jsonStream = req.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        Product product = mapper.readValue(jsonStream, Product.class);

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><head><title>Product detail from JSON</title></head><body>");
            out.println("<h1>Product detail from JSON</h1>");
            out.println("<ul><li>Id: " + product.id() + "</li>");
            out.println("<li>Name: " + product.name() + "</li>");
            out.println("<li>Type: " + product.type() + "</li>");
            out.println("<li>Price: " + product.price() + "</li></ul>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ProductService service = new ProductServiceImpl();
        List<Product> products = service.list();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(products);

        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }
}
