package com.jiaopi404.demos1.config;

import com.jiaopi404.demos1.pojo.User2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
// @ComponentScan 默认扫描 注解类 的 当前包及其子包
@ComponentScan("com.jiaopi404.demos1.pojo") // value, basePackages
@ComponentScan(basePackages = "com.jiaopi404.demos1.pojo")
@ComponentScan(basePackageClasses = {User2.class})
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)
}) // FilterType.ANNOTATION 注解类型， Service.class 注解的 class
public class AppConfig2 { // 根据其生成 IoC 容器装配 Bean
}
