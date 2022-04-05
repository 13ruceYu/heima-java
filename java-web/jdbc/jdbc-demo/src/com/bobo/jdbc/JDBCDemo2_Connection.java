package com.bobo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC 快速入门
 */
public class JDBCDemo2_Connection {
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
        String sql1 = "UPDATE stu SET score = 33.33 WHERE id = 1;";

        // 4. 获取执行 sql 对象 Statement
        Statement stmt = conn.createStatement();


        try {
            // === 开启事务 ===
            conn.setAutoCommit(false);
            // 5. 执行 sql
            int count = stmt.executeUpdate(sql);

            // 6. 处理结果
            System.out.println(count);

            // 5. 执行 sql
            int count1 = stmt.executeUpdate(sql1);

            // 6. 处理结果
            System.out.println(count1);

            // === 提交事务 ===
            conn.commit();
        } catch (Exception e) {
            // 回滚异常
            conn.rollback();

            e.printStackTrace();
        }


        // 7. 释放资源
        stmt.close();
        conn.close();
    }
}
