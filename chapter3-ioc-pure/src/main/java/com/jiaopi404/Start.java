package com.jiaopi404;

import com.jiaopi404.config.AppConfig;
import com.jiaopi404.config.AppConfig2;
import com.jiaopi404.pojo.User;
import com.jiaopi404.pojo.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    public static void main(String[] args) {
        // 1. 装配，基础装
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = ctx.getBean(User.class);
//        System.out.println(user);

        // 2. 使用 Component ComponentScan
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
        User2 user2 = ctx.getBean(User2.class);
        System.out.println(user2);
    }
}
