package com.bobo.web.res;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

// 设置字节数据响应体
@WebServlet("/res4")
public class Demo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、读取文件
        FileInputStream fileInputStream = new FileInputStream("/Users/yuhongbo/Downloads/img/Untitledtest.png");

        // 2、获取字节输出流
        ServletOutputStream os = resp.getOutputStream();

        // 3、完成流的 copy
//        byte[] buff = new byte[1024];
//        int len = 0;
//        while ((len = fileInputStream.read(buff)) != -1) {
//            os.write(buff, 0, len);
//        }
        IOUtils.copy(fileInputStream, os);

        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
