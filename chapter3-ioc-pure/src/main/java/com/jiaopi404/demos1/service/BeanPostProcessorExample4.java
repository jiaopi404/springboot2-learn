package com.jiaopi404.demos1.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置 Bean 初始化器；
 * 这个 Bean 后置处理器将对所有的 Bean 有效；
 */
//@Component
public class BeanPostProcessorExample4 implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用 postProcessBeforeInitialization 方法【" + bean.getClass().getSimpleName() + "】" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用 postProcessAfterInitialization 方法【" + bean.getClass().getSimpleName() + "】" + beanName);
        return bean;
    }
}
