package com.example.demo.util;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public Long extractUserId(String token) {
        return 1L;
    }

    public String extractRole(String token) {
        return "USER";
    }
}
