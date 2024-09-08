package co.argm.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet para gestionar el envío de formularios.
 * Procesa solicitudes POST para el envío de datos del usuario.
 */
@WebServlet("/record")
public class Form extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // Recuperando parámetros de la solicitud
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        String[] languages = req.getParameterValues("languages");
        String[] roles = req.getParameterValues("roles");
        String language = req.getParameter("language");
        boolean enable = "on".equals(req.getParameter("enable"));
        String secret = req.getParameter("secret");

        // Validate the form input
        Map<String, String> errors = validateInput(username, password, email, country, languages, roles, language);

        // Si no hay errores de validación, muestra los resultados del formulario
        if (errors.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {
                out.println(generateHtmlResponse(username, password, email, country, languages, roles, language, enable, secret));
            }
        } else {
            // Si la validación falla, reenvía los errores al formulario
            req.setAttribute("errors", errors);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }

    /**
     * Valida la entrada del usuario.
     *
     * @param username  El nombre de usuario del usuario
     * @param password  La contraseña del usuario
     * @param email     El correo electrónico del usuario
     * @param country   El país seleccionado
     * @param languages Los lenguajes de programación seleccionados
     * @param roles     Los roles seleccionados
     * @param language  El idioma seleccionado para la interfaz
     * @return Un mapa que contiene mensajes de error para campos no válidos, o un mapa vacío si es válido
     */
    private Map<String, String> validateInput(String username, String password, String email, String country, String[] languages, String[] roles, String language) {
        Map<String, String> errors = new HashMap<>();
        if (username == null || username.isBlank()) errors.put("username", "Username is required!");
        if (password == null || password.isBlank()) errors.put("password", "Password cannot be empty!");
        if (email == null || !email.contains("@")) errors.put("email", "Invalid email address!");
        if (country == null || country.isBlank()) errors.put("country", "Country is required!");
        if (languages == null || languages.length == 0)
            errors.put("languages", "You must select at least one programming language!");
        if (roles == null || roles.length == 0) errors.put("roles", "You must select at least one role!");
        if (language == null || language.isBlank()) errors.put("language", "You must select a language!");
        return errors;
    }

    /**
     * Genera la respuesta HTML para mostrar los datos del formulario enviado.
     *
     * @param username  El nombre de usuario del usuario
     * @param password  La contraseña del usuario
     * @param email     El correo electrónico del usuario
     * @param country   El país seleccionado
     * @param languages Los lenguajes de programación seleccionados
     * @param roles     Los roles seleccionados
     * @param language  El idioma seleccionado para la interfaz
     * @param enable    Si el usuario optó por habilitar ciertas configuraciones
     * @param secret    Un valor secreto oculto
     * @return La cadena de respuesta HTML
     */
    private String generateHtmlResponse(String username, String password, String email, String country, String[] languages, String[] roles, String language, boolean enable, String secret) {
        StringBuilder html = new StringBuilder("<html>");
        html.append("<head><title>Form result</title></head>");
        html.append("<body><h1>Form result!</h1><ul>");
        html.append("<li>Username: ").append(username).append("</li>");
        html.append("<li>Password: ").append(password).append("</li>");
        html.append("<li>Email: ").append(email).append("</li>");
        html.append("<li>Country: ").append(country).append("</li>");
        html.append("<li>Languages: <ul>");
        Arrays.stream(languages).forEach(lang -> html.append("<li>").append(lang).append("</li>"));
        html.append("</ul></li>");
        html.append("<li>Roles: <ul>");
        Arrays.stream(roles).forEach(role -> html.append("<li>").append(role).append("</li>"));
        html.append("</ul></li>");
        html.append("<li>Language: ").append(language).append("</li>");
        html.append("<li>Enabled: ").append(enable).append("</li>");
        html.append("<li>Secret: ").append(secret).append("</li>");
        html.append("</ul></body></html>");
        return html.toString();
    }
}