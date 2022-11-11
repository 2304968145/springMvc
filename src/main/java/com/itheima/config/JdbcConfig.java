package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


public class JdbcConfig {

    /*基本数据类型注入*/
    @Value("${jdbc.username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private  String url;
    @Value("${driverClassName}")
    private  String driverClassName;
    @Bean
    private DataSource dataSource(){

        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        return dataSource;

    }
    /*创建事务管理器Bean*/
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){

        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return  transactionManager;
    }

}
