package co.argm.app.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Servlet que maneja la visualización del carrito de compras.
 */
@WebServlet("/see-cart")
public class SeeCart extends HttpServlet {

    /**
     * Maneja solicitudes GET para mostrar el carrito de compras.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws ServletException si ocurre un error en el procesamiento del servlet
     * @throws IOException      si ocurre un error de entrada/salida
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/cart.jsp").forward(req, resp);
    }
}
