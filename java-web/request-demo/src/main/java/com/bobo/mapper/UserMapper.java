package com.bobo.mapper;

import com.bobo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户对象
     * @param username 用户名
     * @param password 密码
     * @return user
     */
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查询用户对象
     * @param username 用户名
     */
    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(String username);

    /**
     * add user
     */
    @Insert("insert into tb_user values (null, #{username}, #{password})")
    void addUser(User user);
}
