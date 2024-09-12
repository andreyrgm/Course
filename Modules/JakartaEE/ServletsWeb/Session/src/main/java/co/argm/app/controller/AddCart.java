package co.argm.app.controller;

import co.argm.app.model.Cart;
import co.argm.app.model.CartItem;
import co.argm.app.model.Product;
import co.argm.app.service.ProductService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

import static java.lang.Integer.parseInt;

@WebServlet("/cart/add")
public class AddCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Optional<Product> product = new ProductService().byId(parseInt(req.getParameter("id")));

        if (product.isPresent()) {
            Cart cart = (Cart) req.getSession().getAttribute("cart");
            cart.addItem(new CartItem(1, product.get()));
        }
        resp.sendRedirect(req.getContextPath() + "/cart/view");
    }
}
