package com.bobo.jdbc;

import com.bobo.pojo.Person;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC API: 详解 ResultSet
 */
public class JDBCDemo4_ResultSet {
    /**
     * execute DML statement
     * @throws Exception
     */
    @Test
    public void testDQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "892400jj";

        // 2. 获取连接
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3. 定义 sql 语句
        String sql = "select * from stu;";

        // 4. 获取执行 sql 对象 Statement
        Statement stmt = conn.createStatement();

        // 5. 执行 sql
        ResultSet res = stmt.executeQuery(sql);

        // 6. 处理结果
        System.out.println(res);
        while (res.next()) {
            int id = res.getInt(1);
            String userName = res.getString(2);
            System.out.println(id + userName);
        }

        // 7. 释放资源
        res.close();
        stmt.close();
        conn.close();
    }

    @Test
    public void testDQLExample() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "892400jj";

        // 2. 获取连接
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3. 定义 sql 语句
        String sql = "select * from stu;";

        // 4. 获取执行 sql 对象 Statement
        Statement stmt = conn.createStatement();

        // 5. 执行 sql
        ResultSet res = stmt.executeQuery(sql);

        List<Person> list = new ArrayList<>();

        // 6. 处理结果
        System.out.println(res);
        while (res.next()) {
            String userName = res.getString("username");
            double score = res.getDouble("score");

            Person person = new Person(userName, score);
            list.add(person);
        }

        System.out.println(list);

        // 7. 释放资源
        res.close();
        stmt.close();
        conn.close();
    }
}
