package co.argm.app.service;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Arrays;
import java.util.Optional;

/**
 * Implementación de LoginService para manejar cookies de autenticación.
 */
public class LoginServiceImp implements LoginService {

    /**
     * Obtiene el nombre de usuario de las cookies de la solicitud.
     *
     * @param req la solicitud HTTP que contiene las cookies
     * @return un Optional con el nombre de usuario si está presente
     */
    @Override
    public Optional<String> getUsername(HttpServletRequest req) {
        Cookie[] cookies = req.getCookies() != null ? req.getCookies() : new Cookie[0];
        return Arrays.stream(cookies)
                .filter(c -> "username".equals(c.getName()))
                .map(Cookie::getValue)
                .findAny();
    }
}
