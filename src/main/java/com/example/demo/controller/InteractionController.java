package com.example.demo.controller;

import com.example.demo.service.InteractionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interactions")
public class InteractionController {

    private final InteractionService interactionService;

    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping("/check")
    public String checkInteractions(@RequestBody List<Long> medicationIds) {
        return interactionService.checkInteractions(medicationIds);
    }
}
