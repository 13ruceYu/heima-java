package com.bobo;

import com.bobo.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = app.getBean(DataSource.class);

        System.out.println(dataSource);
    }
}
