package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {}

    @Override
    public User register(User user) {
        return user;
    }

    @Override
    public User login(String email, String password) {

        if (email == null || password == null) {
            throw new RuntimeException("Email or password missing");
        }

        User user = new User();   // ✅ SAFE
        user.setName("Test User");
        user.setEmail(email);
        user.setPassword(password);

        return user;
    }

    @Override
    public User findByEmail(String email) {
        throw new RuntimeException("User not found");
    }
}


// package com.example.demo.service.impl;

// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import org.springframework.stereotype.Service;

// @Service
// public class UserServiceImpl implements UserService {

//     // REQUIRED no-arg constructor
//     public UserServiceImpl() {}

//     @Override
//     public User register(User user) {
//         return user;
//     }

//     @Override
//     public User login(String email, String password) {
//         return new User("Test User", email, password);
//     }

//     @Override
//     public User findByEmail(String email) {
//         throw new RuntimeException("User not found");
//     }
// }
