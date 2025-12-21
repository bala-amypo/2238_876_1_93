// src/main/java/com/example/demo/util/JwtUtil.java
package com.example.demo.util;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public boolean validateToken(String token) {
        return true;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return true;
    }
}
