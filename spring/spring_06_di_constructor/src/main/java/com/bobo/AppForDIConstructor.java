package com.bobo;

import com.bobo.service.BookService;
import com.bobo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIConstructor {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        // BookService bookService = (BookService) app.getBean("bookService");
        // bookService.save();

        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
