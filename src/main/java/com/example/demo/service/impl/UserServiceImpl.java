package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User register(User user) {
        return user;
    }
}
