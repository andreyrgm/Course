package co.argm.app.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet que muestra los encabezados de la solicitud HTTP.
 */
@WebServlet("/request-headers")
public class RequestHeaders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String methodHttp = req.getMethod();
        String requestUri = req.getRequestURI();
        String requestUrl = req.getRequestURL().toString();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ipAddress = req.getRemoteAddr();
        String localAddr = req.getLocalAddr();
        int localPort = req.getLocalPort();
        String scheme = req.getScheme();
        String host = req.getHeader("Host");
        String url = scheme + "://" + host + contextPath + servletPath;

        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><head><title>HTTP Request Headers</title></head><body>");
            out.println("<h1>HTTP Request Headers</h1>");
            out.println("<ul><li>Method: " + methodHttp + "</li>");
            out.println("<li>Request URI: " + requestUri + "</li>");
            out.println("<li>Request URL: " + requestUrl + "</li>");
            out.println("<li>Context Path: " + contextPath + "</li>");
            out.println("<li>Servlet Path: " + servletPath + "</li>");
            out.println("<li>Local IP: " + localAddr + "</li>");
            out.println("<li>Client IP: " + ipAddress + "</li>");
            out.println("<li>Local Port: " + localPort + "</li>");
            out.println("<li>URL: " + url + "</li></ul>");
            out.println("<h2>Headers</h2>");
            out.println("<ul>");

            Enumeration<String> headers = req.getHeaderNames();
            while (headers.hasMoreElements()) {
                String headerName = headers.nextElement();
                out.println("<li>" + headerName + ": " + req.getHeader(headerName) + "</li>");
            }

            out.println("</ul></body></html>");
        }
    }
}
