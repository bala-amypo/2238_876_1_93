package com.example.demo.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

public class JwtUtil {

    private static final String SECRET = "secret-key";
    private static final long EXPIRATION = 1000 * 60 * 60;

    public static String generateToken(UserDetails userDetails) {
        return generateToken(userDetails.getUsername(), 0L, "USER");
    }

    public static String generateToken(String username) {
        return generateToken(username, 0L, "USER");
    }

    public static String generateToken(String username, Long id, String role) {
        return Jwts.builder()
                .setSubject(username)
                .claim("id", id)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }
}
