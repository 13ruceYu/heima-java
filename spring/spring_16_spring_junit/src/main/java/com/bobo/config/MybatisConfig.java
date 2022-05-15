package com.bobo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setTypeAliasesPackage("com.bobo.domain");

        ssfb.setDataSource(dataSource);

        return ssfb;
    }

    @Bean
    MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();

        mapperScannerConfigurer.setBasePackage("com.bobo.dao");

        return mapperScannerConfigurer;
    }
}
