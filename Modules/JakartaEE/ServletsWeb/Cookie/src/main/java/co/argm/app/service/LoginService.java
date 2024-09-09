package co.argm.app.service;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

/**
 * Interfaz para manejar el servicio de autenticación de usuarios.
 */
public interface LoginService {
    Optional<String> getUsername(HttpServletRequest req);
}

