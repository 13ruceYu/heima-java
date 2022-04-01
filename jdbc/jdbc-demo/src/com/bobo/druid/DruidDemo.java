package com.bobo.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Druid 数据库连接池学习
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 1. 导入 jar 包

        // 2. 定义配置文件 druid.properties

        // 3. 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));

        // 4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5. 获取数据库连接 Connection
        Connection connection = dataSource.getConnection();

        // System.out.println(System.getProperty("user.dir"));
    }
}
