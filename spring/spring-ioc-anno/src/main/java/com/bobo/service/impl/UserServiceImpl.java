package com.bobo.service.impl;

import com.bobo.dao.UserDao;
import com.bobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

// <bean id="userService" class="com.bobo.service.impl.UserServiceImpl">
// <property name="userDao" ref="userDao"></property>
// </bean>
// @Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;

    // @Autowired
    // @Qualifier("userDao") // 按照 id 的值从容器中进行匹配，qualifier 要和 autowired 一起使用
    @Resource(name = "userDao") // resource = qualifier + autowired
    private UserDao userDao;

    // 通过注解开发可不写
    // public void setUserDao(UserDao userDao) {
    //     this.userDao = userDao;
    // }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void beanInit() {
        System.out.println("bean init...");
    }

    @PreDestroy
    public void beanDestroy() {
        System.out.println("bean destroy...");
    }
}
