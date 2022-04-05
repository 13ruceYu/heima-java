package com.bobo.mapper;

import com.bobo.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById();
}
