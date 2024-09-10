package co.argm.app.app.controller;

import co.argm.app.app.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import static jakarta.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

/**
 * Servlet que maneja el inicio de sesión del usuario.
 */
@WebServlet("/login")
public class Login extends HttpServlet {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    /**
     * Maneja las solicitudes GET para verificar si el usuario ha iniciado sesión.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet
     * @throws ServletException si ocurre un error en el procesamiento del servlet
     * @throws IOException      si ocurre un error de entrada/salida
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginService();
        Optional<String> username = auth.getUsername(req);

        if (username.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<html><head><title>Hi " + username.get() + "</title></head><body>");
                out.println("<h1>Hi " + username.get() + ", you have already logged in before!</h1>");
                out.println("<p><a href='" + req.getContextPath() + "/index.html'>Return</a></p>");
                out.println("<p><a href='" + req.getContextPath() + "/logout'>Log out</a></p>");
                out.println("</body></html>");
            }
        } else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    /**
     * Maneja las solicitudes POST para autenticar al usuario y crear una sesión.
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
            req.getSession().setAttribute("username", username); // Guarda el usuario en la sesión
            resp.sendRedirect(req.getContextPath() + "/login");
        } else {
            resp.sendError(SC_UNAUTHORIZED, "Unauthorized access, please try again.");
        }
    }
}
