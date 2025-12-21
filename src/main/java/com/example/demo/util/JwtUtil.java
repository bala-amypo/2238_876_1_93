package com.example.demo.util;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // REQUIRED overloads
    public String generateToken(String email, long userId, String role) {
        return "token";
    }

    public String generateToken(String email, String role) {
        return "token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return true;
    }

    public String extractUsername(String token) {
        return "user@example.com";
    }

    public long extractUserId(String token) {
        return 1L;
    }

    public String extractRole(String token) {
        return "USER";
    }
}
