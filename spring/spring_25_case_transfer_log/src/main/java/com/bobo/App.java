package com.bobo;

import com.bobo.config.SpringConfig;
import com.bobo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = app.getBean(AccountService.class);

        accountService.transfer("Tom", "Jerry", 888D);
    }
}
