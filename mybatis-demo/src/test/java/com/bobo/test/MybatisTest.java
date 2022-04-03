package com.bobo.test;

import com.bobo.mapper.BrandMapper;
import com.bobo.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testSelectAll() throws IOException {
        // 1. 获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取 mapper 接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. 执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void testSelectById() throws IOException {
        // 1. 获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取 mapper 接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. 执行方法
        Brand brand = brandMapper.selectById(1);
        System.out.println(brand);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void testSelectByCondition() throws IOException {
        int status = 0;
        String companyName = "nike";
        String brandName = "nike";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        // brand.setBrandName(brandName);

        // 1. 获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取 mapper 接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. 执行方法
        // List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        List<Brand> brands = brandMapper.selectByCondition(brand);
        System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void testSelectByConditionSingle() throws IOException {
        int status = 1;
        String companyName = "nike";
        String brandName = "nike";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();
        brand.setStatus(status);
        // brand.setCompanyName(companyName);
        // brand.setBrandName(brandName);

        // 1. 获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取 mapper 接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. 执行方法
        // List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void add() throws IOException {
        int status = 1;
        String companyName = "nut";
        String brandName = "nuts";
        int ordered = 101;
        String description = "eat nut every day";

        // 处理参数
        // companyName = "%" + companyName + "%";
        // brandName = "%" + brandName + "%";

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setCompanyName(companyName);
        // brand.setCompanyName(companyName);
        // brand.setBrandName(brandName);

        // 1. 获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3. 获取 mapper 接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. 执行方法
        // List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        brandMapper.add(brand);
        // System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
}
