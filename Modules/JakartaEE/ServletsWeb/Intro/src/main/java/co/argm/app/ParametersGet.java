package co.argm.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet que maneja solicitudes GET y extrae parámetros de la URL.
 */
@WebServlet("/parameters/get")
public class ParametersGet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Establece el tipo de contenido de la respuesta como HTML
        resp.setContentType("text/html");

        // Obtiene el objeto PrintWriter para enviar la respuesta HTML
        try (PrintWriter out = resp.getWriter()) {

            // Obtiene los parámetros 'greet', 'name' y 'code' de la URL
            String greet = req.getParameter("greet");
            String name = req.getParameter("name");

            // Genera la estructura básica de una página HTML
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Parameters Get from URL</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Parameters Get from URL!</h1>");

            // Responde con diferentes mensajes dependiendo de los parámetros presentes
            if (greet != null && name != null) {
                out.println("<h2>The greeting sent is " + greet + " " + name + "</h2>");
            } else if (greet != null) {
                out.println("<h2>The greeting sent is " + greet + "</h2>");
            } else if (name != null) {
                out.println("<h2>Hello, my name is " + name + "</h2>");
            } else {
                out.println("<h2>The greeting or name parameters have not been passed</h2>");
            }

            // Intenta parsear el parámetro 'code' como un número entero
            try {
                int code = Integer.parseInt(req.getParameter("code"));
                out.println("<h3>The code sent is " + code + "</h3>");
            } catch (NumberFormatException e) {
                out.println("<h3>The code sent is not a number</h3>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }
}
