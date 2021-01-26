package com.jiaopi404.demos2;

import com.jiaopi404.demos2.demo1.PropertyDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.jiaopi404.demos2.*")
@PropertySource(value = {"classpath:my.properties"}, ignoreResourceNotFound = true)
public class Start {
    public static void main(String[] args) {
//        SpringApplication.run(Start.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Start.class);
        System.out.println(ctx.isSingleton("propertyDemo"));
        PropertyDemo propertyDemo = ctx.getBean(PropertyDemo.class);
        System.out.println(propertyDemo);
    }
}
