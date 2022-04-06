package com.bobo.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyHttpServlet implements Servlet {
    /**
     * 初始化方法，调用次数 1
     * 初始化调用将 loadOnStartup 设为 1
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 调用时机：每一次 Servlet 被访问时
     * 调用次数：多次
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;

        String method = request.getMethod();

        if ("GET".equals(method)) {
            doGet(req, res);
        } else if ("POST".equals(method)) {
            doPost(req, res);
        }
    }

    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post...");
    }

    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 1. 调用时机：内存释放、服务器关闭
     * 2. 调用次数
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
