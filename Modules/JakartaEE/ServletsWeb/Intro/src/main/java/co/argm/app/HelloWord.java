package co.argm.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet que responde con un mensaje "Hello World" al recibir una solicitud GET.
 */
@WebServlet("/hello-word")
public class HelloWord extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Establece el tipo de contenido de la respuesta como HTML
        resp.setContentType("text/html");

        // Obtiene el objeto PrintWriter para enviar la respuesta HTML
        try (PrintWriter out = resp.getWriter()) {

            // Genera la estructura básica de una página HTML
            out.println("<html>");
            out.println("   <head>");
            out.println("       <title>Hello World Servlet</title>");
            out.println("   </head>");
            out.println("   <body>");
            out.println("       <h1>Hello World Servlet!</h1>");
            out.println("   </body>");
            out.println("</html>");
        }
    }
}
