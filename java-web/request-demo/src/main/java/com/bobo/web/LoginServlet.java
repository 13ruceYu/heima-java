package com.bobo.web;

import com.bobo.mapper.UserMapper;
import com.bobo.pojo.User;
import com.bobo.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. get username and password
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + "-" + password);

        // 2. use mybatis
        // 2-1. get SqlSessionFactory object
        // String resource = "mybatis-config.xml";
        // InputStream inputStream = Resources.getResourceAsStream(resource);
        // SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        // 2-2. get SqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2-3. get Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 2-4. call method
        User user = userMapper.select(username, password);

        // 2-5. release resource
        sqlSession.close();

        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();

        // 3. check
        if (user != null) {
            // login success
            pw.write("login success");
        } else {
            // login failed
            pw.write("login failed");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
