package co.argm.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.*;

@WebServlet("/parameters/get")
public class ParametersGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String greet = req.getParameter("greet");
        String name = req.getParameter("name");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Parameters Get from url</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parameters Get from url!</h1>");
        if (greet != null && name != null) out.println("<h2>The greeting sent is " + greet + " " + name + "</h2>");
        else if (greet != null) out.println("<h2>The greeting sent is " + greet + "</h2>");
        else if (name != null) out.println("<h2>Hello mi name is " + name + "</h2>");
        else out.println("<h2>The greeting or name parameters have not been passed</h2>");
        try {
            int code = parseInt(req.getParameter("code"));
            out.println("<h3>The code sent is " + code + "</h3>");
        } catch (NumberFormatException e) {
            out.println("<h3>The code sent is not a number</h3>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
