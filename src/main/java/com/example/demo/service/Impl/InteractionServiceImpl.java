package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionResultRepository repository;

    public InteractionServiceImpl(InteractionResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public InteractionCheckResult getResult(long id) {
        return repository.findById(id).orElse(null);
    }
}
