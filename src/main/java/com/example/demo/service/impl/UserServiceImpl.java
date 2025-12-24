package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User register(User user) {
        return user;
    }
}
