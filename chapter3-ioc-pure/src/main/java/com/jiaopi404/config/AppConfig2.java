package com.jiaopi404.config;

import com.jiaopi404.pojo.User2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jiaopi404.*")
//@ComponentScan(basePackages = "com.jiaopi404.pojo")
@ComponentScan(basePackageClasses = {User2.class})
public class AppConfig2 {
}
