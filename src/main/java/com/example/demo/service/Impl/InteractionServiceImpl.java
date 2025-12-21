package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionCheckResultRepository repository;

    public InteractionServiceImpl(InteractionCheckResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> ingredientIds) {
        InteractionCheckResult result = new InteractionCheckResult();
        result.setCheckedAt(LocalDateTime.now());
        result.setInteractions("No interactions found");
        return repository.save(result);
    }

    @Override
    public Optional<InteractionCheckResult> getResult(Long id) {
        return repository.findById(id);
    }
}
