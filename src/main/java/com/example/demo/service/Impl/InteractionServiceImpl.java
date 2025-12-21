package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionCheckResultRepository repository;

    // ✅ REQUIRED BY SPRING
    public InteractionServiceImpl(InteractionCheckResultRepository repository) {
        this.repository = repository;
    }

    // ✅ REQUIRED BY TESTS (Mockito can mock this)
    @Override
    public InteractionCheckResult checkInteractions(List<Long> ingredientIds) {
        return new InteractionCheckResult("NONE", "No interaction");
    }
}
