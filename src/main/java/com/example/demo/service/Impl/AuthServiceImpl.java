package com.example.demo.service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public void register(RegisterRequest request) {
        // save user, hash password, set default role
    }

    @Override
    public String login(LoginRequest request) {
        // validate credentials and return JWT
        return "jwt-token";
    }
}
