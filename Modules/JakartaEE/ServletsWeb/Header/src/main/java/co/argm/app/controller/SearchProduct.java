package co.argm.app.controller;

import co.argm.app.Product;
import co.argm.app.service.ProductService;
import co.argm.app.service.ProductServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import static jakarta.servlet.http.HttpServletResponse.SC_NOT_FOUND;

/**
 * Servlet que busca un producto por su nombre y muestra los detalles del producto encontrado.
 */
@WebServlet("/search-product")
public class SearchProduct extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ProductService service = new ProductServiceImpl();
        String name = req.getParameter("product");
        Optional<Product> find = service.list().stream()
                .filter(p -> !name.isBlank() && p.name().contains(name))
                .findFirst();

        if (find.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<html>");
                out.println("<head>");
                out.println("   <title>Product Found</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Product Found</h1>");
                out.println("<h3>Product: " + find.get().name() + " - Price: $" + find.get().price() + "</h3>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            resp.sendError(SC_NOT_FOUND, "Sorry, the product was not found: " + name);
        }
    }
}
