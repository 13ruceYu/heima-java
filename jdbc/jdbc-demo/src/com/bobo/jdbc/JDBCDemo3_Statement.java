package com.bobo.jdbc;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC API: 详解 Statement
 */
public class JDBCDemo3_Statement {
    /**
     * execute DML statement
     * @throws Exception
     */
    @Test
    public void testDML() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "892400jj";

        // 2. 获取连接
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3. 定义 sql 语句
        String sql = "UPDATE stu SET score = 66.33 WHERE id = 0;";

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

    @Test
    public void testDDL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "892400jj";

        // 2. 获取连接
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3. 定义 sql 语句
        String sql = "create database db2;";

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
