package com.jiaopi404.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Person4Impl implements Person4 {
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
}
