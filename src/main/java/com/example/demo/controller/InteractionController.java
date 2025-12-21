package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interactions")
public class InteractionController {

    private final InteractionService service;

    public InteractionController(InteractionService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public InteractionCheckResult getResult(@PathVariable long id) {
        return service.getResult(id);
    }
}
