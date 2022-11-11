package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

/*初始化Servlet容器，加载SpringMvc环境*/
/*public class ServletContainInitConfig  extends AbstractDispatcherServletInitializer {

    protected WebApplicationContext  createServletApplicationContext(){

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return   ctx;
    }
    protected String[] getServletMappings(){

        return  new String[]{"/"};
    }

    protected  WebApplicationContext createRootApplicationContext(){

            return  null;
    }

}*/


public class ServletContainInitConfig  extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    /*post请求乱码处理*/
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        return  new Filter[]{filter};
    }

}
