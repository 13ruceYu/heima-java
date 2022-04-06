package com.bobo.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)
public class ServletDemo2 implements Servlet {
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
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet2!");
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
