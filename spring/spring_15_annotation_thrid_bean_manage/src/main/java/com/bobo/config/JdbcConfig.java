package com.bobo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bobo.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("com.mysql.jdbc.Driver")
    private String driver;

    @Value("jdbc:mysql://localhost:3306/db1")
    private String url;

    @Value("root")
    private String username;

    @Value("892400jj")
    private String password;

    // 1、定义一个方法获取需要管理的对象
    // 2、添加 @Bean，表示当前方法的返回值是一个 bean
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        bookDao.save();
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
