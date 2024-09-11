package co.argm.app.controller;

import co.argm.app.model.Product;
import co.argm.app.service.LoginService;
import co.argm.app.service.ProductService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet({"/products.html", "/products"})
public class Products extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Product> products = new ProductService().listAll();
        Optional<String> opt = new LoginService().getUsername(req);

        String messageRequest = (String) req.getAttribute("message");
        String messageApp = (String) getServletContext().getAttribute("message");
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("   <title>Products List</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Products List!</h1>");
            opt.ifPresent(s -> out.println("<div style='color: blue;'>Hello " + s + ", Welcome!</div>"));
            out.println("<table>");
            out.println("   <tr>");
            out.println("       <th>id</th>");
            out.println("       <th>name</th>");
            out.println("       <th>type</th>");
            if (opt.isPresent()) {
                out.println("   <th>price</th>");
                out.println("   <th>add</th>");
            }
            out.println("   </tr>");
            products.forEach(p -> {
                out.println("<tr>");
                out.println("   <td>" + p.id() + "</td>");
                out.println("   <td>" + p.name() + "</td>");
                out.println("   <td>" + p.type() + "</td>");
                if (opt.isPresent()) {
                    out.println("<td>" + p.price() + "</td>");
                    out.println("<td><a href=\"" + req.getContextPath() + "/add-cart?id=" + p.id() + "\">add to cart</a></td>");
                }
                out.println("</tr>");
            });
            out.println("</table>");
            out.println("<p>" + messageApp + "</p>");
            out.println("<p>" + messageRequest + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
