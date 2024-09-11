package co.argm.app.controller;

import co.argm.app.service.LoginService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/logout")
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Optional<String> username = new LoginService().getUsername(req);
        if (username.isPresent()) req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath() + "/login.html");
    }
}
