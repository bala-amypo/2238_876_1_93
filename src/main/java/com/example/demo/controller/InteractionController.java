package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interactions")
public class InteractionController {

    private final InteractionService service;

    public InteractionController(InteractionService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public InteractionCheckResult getResult(@PathVariable Long id) {
        return service.getResultById(id);
    }

    @PostMapping
    public InteractionCheckResult checkInteractions(@RequestBody List<Long> medicationIds) {
        return service.checkInteractions(medicationIds);
    }

    @PutMapping("/{id}")
    public InteractionCheckResult updateResult(
            @PathVariable Long id,
            @RequestBody InteractionCheckResult result
    ) {
        return service.updateResult(id, result);
    }

    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable Long id) {
        service.deleteResult(id);
    }
}
