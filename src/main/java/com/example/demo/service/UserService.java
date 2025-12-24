package com.example.demo.service;

import java.util.List;
import com.example.demo.model.*;

public interface UserService {
    User register(User user);
    User findByEmail(String email);
}
