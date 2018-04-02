package com.wiley.beginningspring.ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Project: basic
 * @Author: fanlihua
 * @Date: 2018/3/29
 */

@Configuration
@ComponentScan(basePackages = {"com.wiley.beginningspring.ch3"})
public class AppConfig {

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}