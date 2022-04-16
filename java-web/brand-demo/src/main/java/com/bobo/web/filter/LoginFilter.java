package com.bobo.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        // check user in session
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");

        if (user != null) {
            // have login
            // release
            chain.doFilter(request, response);

        } else {
            req.setAttribute("login_msg", "not login");
            req.getRequestDispatcher("/login.jsp").forward(req, response);
        }
    }
}
