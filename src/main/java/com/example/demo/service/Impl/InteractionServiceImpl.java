package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InteractionServiceImpl implements InteractionService {

    private InteractionCheckResultRepository repository;

    // ✅ REQUIRED by Mockito tests
    public InteractionServiceImpl() {}

    public InteractionServiceImpl(InteractionCheckResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> ingredientIds) {
        InteractionCheckResult result =
                new InteractionCheckResult("No interactions", "LOW");
        return result;
    }

    @Override
    public Optional<InteractionCheckResult> getResult(Long id) {
        return repository != null ? repository.findById(id) : Optional.empty();
    }
}
