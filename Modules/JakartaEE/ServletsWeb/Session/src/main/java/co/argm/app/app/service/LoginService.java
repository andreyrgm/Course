package co.argm.app.app.service;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

/**
 * Interfaz que define el servicio de login.
 */
public interface LoginService {
    Optional<String> getUsername(HttpServletRequest req);
}
