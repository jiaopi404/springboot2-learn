package com.jiaopi404.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component // interface 不需要 Component 注解
public class Dog4 implements Animal4 {
    @Override
    public void use() {
        System.out.println("Dog " + Dog4.class.getSimpleName() + " can 看门");
    }
}
