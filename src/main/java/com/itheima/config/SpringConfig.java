package com.itheima.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configurable
@EnableAspectJAutoProxy
/*扫描组件，排除controller注解类*/
@ComponentScan("com.itheima.service")
@PropertySource("classpath:druid.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
