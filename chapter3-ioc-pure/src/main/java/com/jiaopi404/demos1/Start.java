package com.jiaopi404.demos1;

import com.jiaopi404.demos1.config.AppConfig4;
import com.jiaopi404.demos1.service.Person4;
import com.jiaopi404.demos1.service.Person4Impl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 包含：
 * 装配 Bean
 * 依赖注入
 * 生命周期
 */
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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig4.class);
        System.out.println("延迟注入"); // 添加了 lazyInit 后，所有初始化在此行后执行
        Person4 person4 = ctx.getBean(Person4Impl.class);
        person4.service();
        ctx.close();
    }
}
