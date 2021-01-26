package com.jiaopi404.demos1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.jiaopi404.demos1.*", lazyInit = true) // lazyInit 延迟注入
public class AppConfig4 {
}
