package co.argm.app.service;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public class LoginService {
    public Optional<String> getUsername(HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("username");
        if (username != null) return Optional.of(username);
        return Optional.empty();
    }
}
