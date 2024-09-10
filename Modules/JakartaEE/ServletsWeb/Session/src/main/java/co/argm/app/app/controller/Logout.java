package co.argm.app.app.controller;

import co.argm.app.app.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

/**
 * Servlet que maneja la salida del usuario (logout).
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {

    /**
     * Maneja solicitudes GET para cerrar la sesión del usuario.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws ServletException si ocurre un error de servlet
     * @throws IOException      si ocurre un error de entrada/salida
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginService();
        Optional<String> username = auth.getUsername(req);

        if (username.isPresent()) {
            req.getSession().invalidate(); // Invalida la sesión
        }
        resp.sendRedirect(req.getContextPath() + "/login");
    }
}
