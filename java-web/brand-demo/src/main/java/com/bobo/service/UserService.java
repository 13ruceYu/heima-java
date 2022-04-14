package com.bobo.service;

import com.bobo.mapper.UserMapper;
import com.bobo.pojo.User;
import com.bobo.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public User login(String username, String password) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.select(username, password);
        sqlSession.close();
        return user;
    }

    public boolean register(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User u = userMapper.selectByUsername(user.getUsername());

        if (u == null) {
            // user not exist
            userMapper.add(user);
            sqlSession.commit();
        }

        sqlSession.close();

        return u == null;
    }
}
