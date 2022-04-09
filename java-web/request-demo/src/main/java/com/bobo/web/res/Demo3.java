package com.bobo.web.res;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 设置字符数据响应体
@WebServlet("/res3")
public class Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.setHeader("content-type", "text/html;charset=utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();

        writer.write("hello servlet 你好");
        writer.write("<h1>html data</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
