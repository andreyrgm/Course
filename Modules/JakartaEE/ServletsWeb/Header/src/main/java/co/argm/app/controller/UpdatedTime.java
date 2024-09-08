package co.argm.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalTime.now;

/**
 * Servlet que muestra la hora actual y se actualiza automáticamente cada segundo.
 */
@WebServlet("/updated-time")
public class UpdatedTime extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setHeader("refresh", "1"); // Actualiza la página cada segundo

        LocalTime now = now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        try (PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("   <title>Updated Time</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Updated Time</h1>");
            out.println("<h3>" + now.format(formatter) + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
