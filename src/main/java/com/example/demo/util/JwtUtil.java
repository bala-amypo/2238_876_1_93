// src/main/java/com/example/demo/util/JwtUtil.java
package com.example.demo.util;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String extractUsername(String token) {
        return "user@example.com";
    }

    public String generateToken(Long userId, String email, String role) {
        return "dummy-jwt-token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return true;
    }
}
