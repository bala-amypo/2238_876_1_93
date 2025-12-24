package com.example.demo.util;

import org.springframework.security.core.userdetails.UserDetails;

public class JwtUtil {

    public String generateToken(String email, Long id, String role) {
        return "token";
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return true;
    }

    public String extractUsername(String token) {
        return "user@example.com";
    }

    public Long extractUserId(String token) {
        return 1L;
    }

    public String extractRole(String token) {
        return "USER";
    }
}
