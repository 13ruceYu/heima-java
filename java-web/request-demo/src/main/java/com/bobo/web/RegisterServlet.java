package com.bobo.web;

import com.bobo.mapper.UserMapper;
import com.bobo.pojo.User;
import com.bobo.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. receive user data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // encapsulate user
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        // 2-2. get SqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2-3. get Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User u = userMapper.selectByUsername(username);

        if (u == null) {
            // username not exist
            userMapper.addUser(user);
            sqlSession.commit();
            sqlSession.close();
        } else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("用户名已存在");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
