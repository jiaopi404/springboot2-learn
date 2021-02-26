package com.jiaopi404.demos1;

import com.jiaopi404.demos1.config.AppConfig;
import com.jiaopi404.demos1.config.AppConfig2;
import com.jiaopi404.demos1.config.AppConfig3;
import com.jiaopi404.demos1.config.AppConfig4;
import com.jiaopi404.demos1.pojo.User;
import com.jiaopi404.demos1.pojo.User2;
import com.jiaopi404.demos1.service.Person4;
import com.jiaopi404.demos1.service.Person4Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * 包含：
 * 装配 Bean
 * 依赖注入
 * 生命周期
 */
public class Start {

    public static void main(String[] args) {
        // 0. AnnotationConfigApplicationContext 基于注解的 IoC 容器
        // ApplicationContext ctx 根据配置文件创建的 IoC 容器
        // 1. 装配，基础装
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = ctx.getBean(User.class);
//        User user2 = (User) ctx.getBean("user"); // 使用 get by name 方法需要强制转换
//        System.out.println(user);
//        System.out.println(user2);
//        System.out.println(user == user2);

        // 2. 使用 Component ComponentScan
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
//        User2 user2 = ctx.getBean(User2.class);
//        System.out.println(user2);
//        System.out.println("ctx.getBeanDefinitionNames(): ");
//        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        // 3. 自定义第三方 Bean；使用 DBCP(DataBase Connection Pool 数据库连接池) 生成数据源
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
////        DataSource dataSource = ctx.getBean(DataSource.class);
//        DataSource dataSource = (DataSource) ctx.getBean("dataSource"); // 同样的方式
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
