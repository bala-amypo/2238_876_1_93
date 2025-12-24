package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {}

    public User register(User user) {
        return user;
    }

    public User findByEmail(String email) {
        throw new RuntimeException("User not found");
    }
}
