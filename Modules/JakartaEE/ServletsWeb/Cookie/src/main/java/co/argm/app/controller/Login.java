package co.argm.app.controller;

import co.argm.app.service.LoginService;
import co.argm.app.service.LoginServiceImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import static jakarta.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

/**
 * Servlet que maneja las solicitudes de login de los usuarios.
 */
@WebServlet("/login")
public class Login extends HttpServlet {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    /**
     * Método que maneja solicitudes GET para verificar si el usuario ya ha iniciado sesión.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws ServletException si ocurre un error de servlet
     * @throws IOException      si ocurre un error de entrada/salida
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceImp();
        Optional<String> cookie = auth.getUsername(req);

        if (cookie.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<html><head><title>Hi " + cookie.get() + "</title></head><body>");
                out.println("<h1>Hi " + cookie.get() + ", you have already logged in before!</h1>");
                out.println("<p><a href='" + req.getContextPath() + "/index.html'>Return</a></p>");
                out.println("<p><a href='" + req.getContextPath() + "/logout'>Log out</a></p>");
                out.println("</body></html>");
            }
        } else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    /**
     * Método que maneja solicitudes POST para el inicio de sesión del usuario.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws IOException si ocurre un error de entrada/salida
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            Cookie cookie = new Cookie("username", username);
            resp.addCookie(cookie);
            resp.sendRedirect(req.getContextPath() + "/login.html");
        } else {
            resp.sendError(SC_UNAUTHORIZED, "Unauthorized access, please try again.");
        }
    }
}
