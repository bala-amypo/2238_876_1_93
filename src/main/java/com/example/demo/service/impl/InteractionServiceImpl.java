package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import java.util.List;

public class InteractionServiceImpl implements InteractionService {

    public InteractionServiceImpl() {}

    public InteractionCheckResult checkInteractions(List<Long> ids) {
        return new InteractionCheckResult();
    }

    public InteractionCheckResult getResult(Long id) {
        throw new RuntimeException("Result not found");
    }
}
