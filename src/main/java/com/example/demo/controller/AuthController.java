package com.example.demo.controller;
@RestController
public class AuthController {
    @Autowired
    @PostMapping("/auth")
    public User createData(@Request)

}
