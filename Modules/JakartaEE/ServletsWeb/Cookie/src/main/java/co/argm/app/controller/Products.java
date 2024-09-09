package co.argm.app.controller;

import co.argm.app.Product;
import co.argm.app.service.LoginService;
import co.argm.app.service.LoginServiceImp;
import co.argm.app.service.ProductService;
import co.argm.app.service.ProductServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

/**
 * Servlet que muestra una lista de productos.
 */
@WebServlet("/products")
public class Products extends HttpServlet {

    /**
     * Método que maneja solicitudes GET para listar los productos.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws IOException si ocurre un error de entrada/salida
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ProductService productService = new ProductServiceImpl();
        List<Product> products = productService.list();

        LoginService auth = new LoginServiceImp();
        Optional<String> cookieOpt = auth.getUsername(req);

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><head><title>Product List</title></head><body>");
            out.println("<h1>Product List!</h1>");
            cookieOpt.ifPresent(s -> out.println("<div style='color: blue;'>Hi " + s + ", welcome!</div>"));

            out.println("<table><tr><th>id</th><th>name</th><th>type</th>");
            if (cookieOpt.isPresent()) out.println("<th>price</th>");
            out.println("</tr>");

            products.forEach(p -> {
                out.println("<tr><td>" + p.id() + "</td><td>" + p.name() + "</td><td>" + p.type() + "</td>");
                if (cookieOpt.isPresent()) out.println("<td>" + p.price() + "</td>");
                out.println("</tr>");
            });
            out.println("</table></body></html>");
        }
    }
}
