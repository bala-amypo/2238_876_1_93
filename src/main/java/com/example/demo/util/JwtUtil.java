package com.example.demo.util;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String extractUsername(String token) {
        return token;
    }

    public String generateToken(Long id, String email, String role) {
        return "token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return true;
    }
}
