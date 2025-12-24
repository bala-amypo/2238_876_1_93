package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;

import java.util.ArrayList;
import java.util.List;

public class InteractionServiceImpl implements InteractionService {

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        return new InteractionCheckResult();
    }

    @Override
    public List<InteractionCheckResult> history() {
        return new ArrayList<>();
    }
}
