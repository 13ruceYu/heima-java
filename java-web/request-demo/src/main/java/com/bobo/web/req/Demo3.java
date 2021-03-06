package com.bobo.web.req;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 解析中文字符
 */
@WebServlet("/demo3")
public class Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // post 中文参数
        req.setCharacterEncoding("UTF-8");

        // 获取 username
        String username = req.getParameter("username");
        System.out.println(username);

        // get 中文参数 getQueryString
        // 乱码原因 tomcat 使用 ISO-8895-1 进行 URL 解码
        byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
        String string = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(string);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
