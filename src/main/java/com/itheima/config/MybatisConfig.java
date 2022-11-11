package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){

        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setTypeAliasesPackage("com.itheima.domain");
        sqlSessionFactory.setDataSource(dataSource);

        return  sqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){

        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima.dao");
        return  msc;

    }

}
