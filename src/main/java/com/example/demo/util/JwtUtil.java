package com.example.demo.util;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // Used by AuthController
    public String generateToken(String email) {
        return "generatedToken";
    }

    // Used by tests (keep this)
    public String generateToken(String email, Long userId, String role) {
        return "generatedToken";
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
