package com.jiaopi404.demos1.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person4Impl implements Person4, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {
//    @Autowired
//    @Qualifier("dog4") // 规定一个 bean，优先级比 Cat4 上面的 @Primary 高0
//    private Animal4 animal4 = null; // 根据 type， 当前会有两个，因此报错
//    private Animal4 cat4 = null; // 根据 type 和 name
    private Animal4 animal4 = null;

    // 使用构造参数 + 对参数的注解 进行依赖注入；
    public Person4Impl (@Autowired @Qualifier("dog4") Animal4 animal4) {
        this.animal4 = animal4;
    }

    @Override
    public void service() {
        animal4.use();
//        cat4.use();
    }

    @Override
    public void setAnimal(Animal4 animal4) {
        this.animal4 = animal4;
//        this.cat4 = animal4;
    }

    /**
     * 以下声明周期
     * @param s
     */
    @Override
    public void setBeanName(String s) {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "BeanNameAware 的 setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "BeanFactoryAware 的 setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "ApplicationContextAware 的 setApplicationAware");
    }

    @PostConstruct // 定义初始化方法
    public void myInit () {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "自定义的，标注为 @PostConstruct 的 myInit 初始化方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "InitializingBean 的 afterPropertiesSet");
    }

    @PreDestroy // 定义销毁方法
    public void myDestroy () throws Exception {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "自定义的，标注为 @PostConstruct 的 myDestroy 销毁方法");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用" + "DisposableBean 的 destroy 方法");
    }
}
