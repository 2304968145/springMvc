package com.itheima.config;

import com.itheima.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/*让这个类失效，直接全部配置到SpringMvcConfig(继承WebMvcConfigurer接口，实现下面两个接口即可)（中*/

/*@Configuration*/
public class SpringMvcSupport extends WebMvcConfigurationSupport {
/*静态资源放行*/
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/css/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }


    /*这里的这个报错不用管*/
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(projectInterceptor).addPathPatterns("/books");
    }
}
