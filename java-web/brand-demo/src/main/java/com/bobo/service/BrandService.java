package com.bobo.service;

import com.bobo.mapper.BrandMapper;
import com.bobo.pojo.Brand;
import com.bobo.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * query all
     */
    public List<Brand> selectAll() {
        // 1. 调用 BrandMapper.selectAll

        // 2. get SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 4. call method
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);

        sqlSession.close();

        return brands;
    }
}
