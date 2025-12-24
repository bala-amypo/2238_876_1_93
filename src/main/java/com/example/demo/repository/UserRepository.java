package com.example.demo.repository;

import java.util.*;
import com.example.demo.model.*;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
}
