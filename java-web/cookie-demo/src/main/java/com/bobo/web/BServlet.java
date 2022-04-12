package com.bobo.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bServlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 cookie

        // 1、获取 cookie 数组
        Cookie[] cookies = request.getCookies();

        // 2、遍历数组
        for (Cookie cookie : cookies) {
            // 3、获取 cookie 数据
            String name = cookie.getName();
            if ("username".equals(name)) {
                String value = cookie.getValue();
                System.out.println(name + ": " + value);

                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
