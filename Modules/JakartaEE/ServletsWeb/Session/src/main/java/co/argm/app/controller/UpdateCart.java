package co.argm.app.controller;

import co.argm.app.model.Cart;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import static java.lang.Integer.parseInt;

@WebServlet("/update-cart")
public class UpdateCart extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        updateProducts(req, (Cart) req.getSession().getAttribute("cart"));
        updateQuantities(req, (Cart) req.getSession().getAttribute("cart"));
        resp.sendRedirect(req.getContextPath() + "/view-cart");
    }

    private void updateProducts(HttpServletRequest request, Cart cart) {
        String[] deleteIds = request.getParameterValues("deleteProducts");
        if (deleteIds != null && deleteIds.length > 0) {
            List<String> productIds = Arrays.asList(deleteIds);
            cart.removeProducts(productIds);
        }
    }

    private void updateQuantities(HttpServletRequest request, Cart cart) {
        Enumeration<String> num = request.getParameterNames();
        while (num.hasMoreElements()) {
            String paramName = num.nextElement();
            if (paramName.startsWith("qty_")) if (request.getParameter(paramName) != null)
                cart.updateQuantity(paramName.substring(4), parseInt(request.getParameter(paramName)));
        }
    }
}
