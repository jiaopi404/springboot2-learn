package com.jiaopi404.demos1.service;

import com.jiaopi404.demos1.pojo.User2;
import org.springframework.stereotype.Component;

@Component
public class User2ServiceImpl implements User2Service {
    @Override
    public String getName(User2 user2) {
        return user2.getName();
    }
}
