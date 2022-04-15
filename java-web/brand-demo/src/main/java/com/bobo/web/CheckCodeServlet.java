package com.bobo.web;

import com.bobo.util.CheckCodeUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileOutputStream;
import java.io.IOException;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 生成验证码
        ServletOutputStream outputStream = response.getOutputStream();
        String checkCode = CheckCodeUtil.outputVerifyImage(100, 50, outputStream, 4);

        // 存入 session
        HttpSession session = request.getSession();
        session.setAttribute("checkCodeGen", checkCode);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
