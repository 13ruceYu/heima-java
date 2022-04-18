package com.bobo.dao.impl;

import com.bobo.dao.UserDao;
import com.bobo.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private String username;
    private int age;

    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public UserDaoImpl() {
    //     System.out.println("UserDao 创建...");
    // }
    //
    // public void init() {
    //     System.out.println("userDao init...");
    // }
    //
    // public void destroy() {
    //     System.out.println("userDao destroy...");
    // }

    @Override
    public void save() {
        // System.out.println(username + "===" + age);
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("userDao save...");

    }
}
