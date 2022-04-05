package com.bobo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC 快速入门
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        // 1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // String url = "jdbc:mysql://127.0.0.1:3306/db1";
        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "892400jj";

        // 2. 获取连接
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3. 定义 sql 语句
        String sql = "UPDATE stu SET score = 22.33 WHERE id = 0;";

        // 4. 获取执行 sql 对象 Statement
        Statement stmt = conn.createStatement();

        // 5. 执行 sql
        int count = stmt.executeUpdate(sql);

        // 6. 处理结果
        System.out.println(count);

        // 7. 释放资源
        stmt.close();
        conn.close();
    }
}
