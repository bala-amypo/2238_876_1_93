// src/main/java/com/example/demo/controller/InteractionController.java
package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interactions")
public class InteractionController {

    private final InteractionService interactionService;

    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping
    public InteractionCheckResult check(@RequestBody List<Long> ingredientIds) {
        return interactionService.checkInteractions(ingredientIds);
    }
}
