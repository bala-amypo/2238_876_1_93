package com.example.demo.util;

public class JwtUtil {

    public String generateToken(String email) {
        return "dummy-token-for-" + email;
    }

    public String extractUsername(String token) {
        if (token == null) {
            return null;
        }
        return token.replace("dummy-token-for-", "");
    }

    public boolean validateToken(String token, String email) {
        return token != null && token.equals("dummy-token-for-" + email);
    }
}
