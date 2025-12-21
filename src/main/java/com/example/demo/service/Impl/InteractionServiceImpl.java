package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    public InteractionServiceImpl() {}

    public InteractionServiceImpl(InteractionResultRepository repo) {}

    @Override
    public InteractionCheckResult checkInteractions(List<Long> ingredientIds) {
        return new InteractionCheckResult("No interactions", "system");
    }

    @Override
    public InteractionCheckResult getResult(long id) {
        return new InteractionCheckResult("Result", "system");
    }
}
