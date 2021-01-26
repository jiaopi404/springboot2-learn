package com.jiaopi404.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 提高优先级
public class Cat4 implements Animal4 {
    @Override
    public void use() {
        System.out.println("cat " + Cat4.class.getSimpleName() + " can 抓老鼠");
    }
}
