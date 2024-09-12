package co.argm.app.filter;

import co.argm.app.service.LoginService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

import static jakarta.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

@WebFilter("/cart/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain ch) throws IOException, ServletException {
        Optional<String> opt = new LoginService().getUsername((HttpServletRequest) req);
        if (opt.isPresent()) ch.doFilter(req, resp);
        else
            ((HttpServletResponse) resp).sendError(SC_UNAUTHORIZED, "Sorry, you are not authorized to enter this page!");
    }
}
