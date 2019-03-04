package com.gem.film_management.SpringBootMVC;

import com.gem.film_management.intercepter.WebIntercepter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
public class SpringBootMVC extends WebMvcConfigurerAdapter{

    @Value("${web.upload-path}")
    private String path;
    
    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	registry.addInterceptor(new WebIntercepter()).addPathPatterns("/**").excludePathPatterns("/film/login", "/login", "/web/show", "/web/signIn","/web/addSignIn");
    	
    	super.addInterceptors(registry);
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //给html添加一个control,让html访问
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/").setViewName("/login");

        super.addViewControllers(registry);
    }
    //静态资源放行
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("../**").addResourceLocations("classpath:../*");

        registry.addResourceHandler("/upload/**").addResourceLocations("file:/"+path);
       
        super.addResourceHandlers(registry);

    }
}