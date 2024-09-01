package co.argm.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello-word")
public class HelloWordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Hello Word Servlet</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("       <h1>Hello Word Servlet!</h1>");
        out.println("   </body>");
        out.println("</html>");
    }
}
