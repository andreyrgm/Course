package co.argm.app.controller;

import co.argm.app.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import static jakarta.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

@WebServlet({"/login", "/login.html"})
public class Login extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Optional<String> opt = new LoginService().getUsername(req);

        if (opt.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<html>");
                out.println("<head>");
                out.println("   <title>Hello " + opt.get() + "</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Hello " + opt.get() + ", you have successfully logged in!</h1>");
                out.println("<p><a href='" + req.getContextPath() + "/index.html'>Go back</a></p>");
                out.println("<p><a href='" + req.getContextPath() + "/logout'>Log out</a></p>");
                out.println("</body>");
                out.println("</html>");
            }
        } else getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (USERNAME.equals(req.getParameter("username")) && PASSWORD.equals(req.getParameter("password"))) {
            req.getSession().setAttribute("username", req.getParameter("username"));
            resp.sendRedirect(req.getContextPath() + "/login.html");
        } else resp.sendError(SC_UNAUTHORIZED, "Sorry, you are not authorized to access this page!");
    }
}
