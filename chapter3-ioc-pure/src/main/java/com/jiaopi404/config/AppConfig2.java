package com.jiaopi404.config;

import com.jiaopi404.pojo.User2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan("com.jiaopi404.*") // value, basePackages
//@ComponentScan(basePackages = "com.jiaopi404.pojo")
@ComponentScan(basePackageClasses = {User2.class})
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)
}) // FilterType.ANNOTATION 注解类型， Service.class 注解的 class
public class AppConfig2 { // 根据其生成 IoC 容器装配 Bean
}
