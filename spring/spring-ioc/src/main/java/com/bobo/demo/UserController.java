package com.bobo.demo;

import com.bobo.service.UserService;
import com.bobo.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        // UserService userService = new UserServiceImpl();
        // userService.save();
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
