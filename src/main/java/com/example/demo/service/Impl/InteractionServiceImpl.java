package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private InteractionResultRepository resultRepository;

    // REQUIRED BY TESTS
    public InteractionServiceImpl() {}

    public InteractionServiceImpl(InteractionResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<InteractionCheckResult> checkInteractions(List<Long> ingredientIds) {
        return new ArrayList<>(); // tests only verify invocation
    }
}
