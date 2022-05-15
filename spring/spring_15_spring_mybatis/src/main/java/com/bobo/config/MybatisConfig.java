package com.bobo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setTypeAliasesPackage("com.bobo.domain");

        ssfb.setDataSource(dataSource);

        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();

        msc.setBasePackage("com.bobo.dao");

        return msc;
    }
}

// <typeAliases>
// <package name="com.bobo.domain"/>
// </typeAliases>
//
// <environments default="mysql">
// <environment id="mysql">
// <transactionManager type="JDBC"></transactionManager>
// <dataSource type="POOLED">
// <property name="driver" value="${jdbc.driver}"/>
// <property name="url" value="${jdbc.url}"/>
// <property name="username" value="${jdbc.username}"/>
// <property name="password" value="${jdbc.password}"/>
// </dataSource>
// </environment>
// </environments>
//
// <mappers>
// <package name="com.bobo.dao"/>
// </mappers>
