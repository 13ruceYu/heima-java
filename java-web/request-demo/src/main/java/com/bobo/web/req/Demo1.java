package com.bobo.web.req;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/demo1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // String getMethod()
        String method = req.getMethod();
        System.out.println("method: " + method);
        String contextPath = req.getContextPath();
        System.out.println("context: " + contextPath);
        StringBuffer url = req.getRequestURL();
        System.out.println("url: " + url);
        String uri = req.getRequestURI();
        System.out.println("uri: " + uri);
        String queryString = req.getQueryString();
        System.out.println("queryString: " + queryString);

        String agent = req.getHeader("user-agent");
        System.out.println("agent: " + agent);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String line = br.readLine();
        System.out.println("post: " + line);
    }
}
