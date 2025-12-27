package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    public AuthController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody User user) {

        User loggedIn = userService.login(user.getEmail(), user.getPassword());
        String token = jwtUtil.generateToken(loggedIn.getEmail());

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return ResponseEntity.ok(response);
    }
}


// package com.example.demo.controller;

// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import com.example.demo.util.JwtUtil;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/auth")
// public class AuthController {

//     private final UserService userService;
//     private final JwtUtil jwtUtil;

//     public AuthController(UserService userService, JwtUtil jwtUtil) {
//         this.userService = userService;
//         this.jwtUtil = jwtUtil;
//     }

//     @PostMapping("/register")
//     public User register(@RequestBody User user) {
//         return userService.register(user);
//     }

//     @PostMapping("/login")
//     public String login(@RequestBody User user) {
//         User loggedIn = userService.login(user.getEmail(), user.getPassword());
//         return jwtUtil.generateToken(loggedIn.getEmail());
//     }
// }
