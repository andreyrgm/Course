package co.argm.app.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static jakarta.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

/**
 * Servlet que maneja el inicio de sesión.
 */
@WebServlet("/login")
public class Login extends HttpServlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<html><head><title>Login successful</title></head><body>");
                out.println("<h1>Login successful</h1>");
                out.println("<h3>Welcome " + username + ", you have successfully logged in!</h3>");
                out.println("</body></html>");
            }
        } else {
            resp.sendError(SC_UNAUTHORIZED, "Unauthorized access, please try again.");
        }
    }
}
