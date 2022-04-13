package com.bobo.web;

import com.bobo.pojo.User;
import com.bobo.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. get username and password
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String remember = request.getParameter("remember");

        // 2. call service query
        User user = service.login(username, password);


        // 3. check user
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            // login success, jump to brand
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/selectAllServlet");
        } else {
            request.setAttribute("login_msg", "用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
