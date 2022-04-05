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

        int id = brand.getId();
        System.out.println(id);
        // System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void testUpdate() throws IOException {
        int id = 6;
        int status = 0;
        String companyName = "nutshell";
        String brandName = "tasty shell";
        int ordered = 104;
        String description = "don't eat nut every day";

        // 处理参数
        // companyName = "%" + companyName + "%";
        // brandName = "%" + brandName + "%";

        Brand brand = new Brand();
        brand.setId(id);
        brand.setStatus(status);
        // brand.setBrandName(brandName);
        // brand.setDescription(description);
        // brand.setOrdered(ordered);
        // brand.setCompanyName(companyName);
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
        int count = brandMapper.update(brand);
        System.out.println(count);
        // System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void testDelete() throws IOException {
        int id = 1;

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
        brandMapper.deleteById(id);

        System.out.println(id);
        // System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
    @Test
    public void testDeleteByIds() throws IOException {
        int[] ids = {2, 4};

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
        brandMapper.deleteByIds(ids);

        // System.out.println(brands);


        // 5. 释放资源
        sqlSession.close();
    }
}
