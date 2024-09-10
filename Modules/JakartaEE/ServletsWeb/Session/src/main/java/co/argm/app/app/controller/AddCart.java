package co.argm.app.app.controller;

import co.argm.app.app.Cart;
import co.argm.app.app.ItemCart;
import co.argm.app.app.Product;
import co.argm.app.app.service.ProductService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

/**
 * Servlet que maneja la adición de productos al carrito de compras.
 */
@WebServlet("/add-cart")
public class AddCart extends HttpServlet {

    /**
     * Maneja solicitudes GET para agregar un producto al carrito de compras.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws IOException si ocurre un error de entrada/salida
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ProductService service = new ProductService();
        Optional<Product> product = service.byId(id);

        if (product.isPresent()) {
            ItemCart item = new ItemCart(1, product.get());
            Cart cart;

            if (req.getSession().getAttribute("cart") == null) {
                cart = new Cart();
                req.getSession().setAttribute("cart", cart);
            } else {
                cart = (Cart) req.getSession().getAttribute("cart");
            }

            cart.addItem(item);
        }

        resp.sendRedirect(req.getContextPath() + "/see-cart");
    }
}
