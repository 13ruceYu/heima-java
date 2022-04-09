package com.bobo.web.res;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/res1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("res1...");

//        resp.setStatus(302);
//        resp.setHeader("Location", "/request-demo/res2");
        // 动态获取虚拟目录，解藕
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/res2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
