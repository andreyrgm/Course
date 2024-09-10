package co.argm.app.app.service;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

/**
 * Servicio que maneja la autenticación de usuarios.
 */
public class LoginService {

    /**
     * Obtiene el nombre de usuario almacenado en la sesión.
     *
     * @param req el objeto HttpServletRequest que contiene la sesión del usuario
     * @return un Optional con el nombre de usuario si está presente
     */
    public Optional<String> getUsername(HttpServletRequest req) {
        Object username = req.getSession().getAttribute("username");
        if (username != null) {
            return Optional.of(username.toString());
        } else {
            return Optional.empty();
        }
    }
}
