package com.bobo.web;

import com.bobo.pojo.User;
import com.bobo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. get username and password
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // get user checkCode
        String checkCode = request.getParameter("checkCode");

        // get system checkCode
        HttpSession session = request.getSession();
        String checkCodeGen = (String) session.getAttribute("checkCodeGen");

        // compare
        if (!checkCodeGen.equals(checkCode)) {
            request.setAttribute("register_msg", "failed, captcha error");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
            // not allow register
            return;
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // 2. call service
        boolean flag = service.register(user);

        if (flag) {
            request.setAttribute("register_msg", "success, plz login");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            request.setAttribute("register_msg", "failed, username exists");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
