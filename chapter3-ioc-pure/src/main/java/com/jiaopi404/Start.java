package com.jiaopi404;

import com.jiaopi404.config.AppConfig;
import com.jiaopi404.config.AppConfig2;
import com.jiaopi404.config.AppConfig3;
import com.jiaopi404.config.AppConfig4;
import com.jiaopi404.pojo.User;
import com.jiaopi404.pojo.User2;
import com.jiaopi404.service.Person4;
import com.jiaopi404.service.Person4Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class Start {
    public static void main(String[] args) {
        // 0. AnnotationConfigApplicationContext 基于注解的 IoC 容器
        // ApplicationContext ctx IoC 容器
        // 1. 装配，基础装
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = ctx.getBean(User.class);
//        System.out.println(user);

        // 2. 使用 Component ComponentScan
//        Appli                                                                        cationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
//        User2 user2 = ctx.getBean(User2.class);
//        System.out.println(user2);
        // 3. 自定义第三方 Bean；使用 DBCP(DataBase Connection Pool 数据库连接池) 生成数据源
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
//        DataSource dataSource = ctx.getBean(DataSource.class);
//        System.out.println(dataSource);
        // 4. 依赖注入 demo
        /**
         * 1. Autowired 注入机制： byType, byName, so on;
         * 2. 默认必须要找到Bean，若不确定存在且允许为 Null，@Autowired(required = false);
         * 3. 可标注方法 or 参数
         * 4. 歧义性的解决: @Primary @Qualifier; @Qualifier > @Primary > 不设置
         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig4.class);
        Person4 person4 = ctx.getBean(Person4Impl.class);
        person4.service();
    }
}
