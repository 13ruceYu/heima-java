package com.bobo;

import com.bobo.config.SpringConfig;
import com.bobo.domain.Account;
import com.bobo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = app.getBean(AccountService.class);

        Account account = accountService.findById(1);

        System.out.println(account);
    }
}
