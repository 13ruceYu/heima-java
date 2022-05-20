package com.bobo;

import com.bobo.config.SpringConfig;
import com.bobo.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

        ResourceService resourceService = app.getBean(ResourceService.class);

        Boolean flag = resourceService.openURL("https://yo.com", "root ");

        System.out.println(flag);

    }
}
