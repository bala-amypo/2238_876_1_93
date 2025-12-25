package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    // REQUIRED no-arg constructor
    public InteractionServiceImpl() {}

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        return new InteractionCheckResult(
                "Test Medications",
                "{\"interactions\": []}"
        );
    }

    @Override
    public InteractionCheckResult getResult(Long id) {
        InteractionCheckResult result = new InteractionCheckResult();
        result.setId(id);
        result.setCheckedAt(LocalDateTime.now());
        return result;
    }
}
