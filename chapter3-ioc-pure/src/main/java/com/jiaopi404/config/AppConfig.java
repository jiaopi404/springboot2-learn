package com.jiaopi404.config;

import com.jiaopi404.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration 代表这是一个 Java 配置文件，spring 的容器会根据它来生成 IoC 容器去装配 Bean
 */
@Configuration
public class AppConfig {
    /**
     * Bean 代表将 initUser 方法返回的 POJO 装配到 IoC 容器，name 定义这个 Bean 的名称，若不定义，则将方法 "initUser" 作为 Bean 的名称
     */
    @Bean(name = "user")
    public User initUser () {
        User user = new User();
        user.setId(1L);
        user.setName("jiaopi404");
        return user;
    }
}

