package com.example.demo.service.impl;

import com.example.demo.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    // REQUIRED BY TESTS
    public UserServiceImpl() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public UserServiceImpl(UserRepository userRepository,
                           BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
}
