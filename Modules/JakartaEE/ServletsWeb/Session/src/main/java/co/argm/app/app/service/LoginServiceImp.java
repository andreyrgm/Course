package co.argm.app.app.service;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

/**
 * Implementación del servicio de login que obtiene el nombre de usuario de la sesión.
 */
public class LoginServiceImp implements LoginService {

    /**
     * Obtiene el nombre de usuario almacenado en la sesión.
     *
     * @param req el objeto HttpServletRequest que contiene la sesión del usuario
     * @return un Optional con el nombre de usuario si está presente
     */
    @Override
    public Optional<String> getUsername(HttpServletRequest req) {
        Object username = req.getSession().getAttribute("username");
        if (username != null) {
            return Optional.of(username.toString());
        } else {
            return Optional.empty();
        }
    }
}
