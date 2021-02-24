package com.jiaopi404.demos0.sourceCodes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;

/**
 * 所有 IOC 的顶级容器接口 BeanFactory;
 * 详细参考：spring IoC 容器的接口设计(顶级接口 BeanFactory 高级接口 ApplicationContext)
 */
public interface BeanFactory {
    // 前缀
    String FACTORY_BEAN_PREFIX = "&";

    // 多个 getBean 方法
    Object getBean(String name) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    // 是否包含 Bean
    boolean containsBean(String name);

    // bean 是否单例
    boolean isSingleton(String name) throws NoSuchBeanDefinitionException;

    // bean 是否原型
    boolean isPrototype (String name) throws NoSuchBeanDefinitionException;

    // 是否类型匹配
    boolean isTypeMatch (String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;

    boolean isTypeMatch (String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException;

    // 获取 Bean 类型
    Class<?> getType (String name) throws NoSuchBeanDefinitionException;

    // 获取 Bean 的别名
    String[] getAliases (String name);
}
