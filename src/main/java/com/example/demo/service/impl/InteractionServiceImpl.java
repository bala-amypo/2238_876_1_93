package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    // REQUIRED by tests
    public InteractionServiceImpl() {}

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        // MUST use no-arg constructor
        InteractionCheckResult result = new InteractionCheckResult();
        return result;
    }

    @Override
    public InteractionCheckResult getResult(Long id) {
        InteractionCheckResult result = new InteractionCheckResult();
        result.setId(id);   // ID exists in model
        return result;
    }
}
