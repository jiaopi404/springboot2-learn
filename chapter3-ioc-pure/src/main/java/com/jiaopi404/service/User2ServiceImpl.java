package com.jiaopi404.service;

import com.jiaopi404.pojo.User2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class User2ServiceImpl implements User2Service {
    @Override
    public String getName(User2 user2) {
        return user2.getName();
    }
}
