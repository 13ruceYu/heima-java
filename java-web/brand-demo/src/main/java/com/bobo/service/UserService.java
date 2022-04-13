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
}
