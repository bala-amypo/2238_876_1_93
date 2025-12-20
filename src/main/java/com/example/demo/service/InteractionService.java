package com.example.demo.service;

import com.example.demo.dto.InteractionCheckRequest;
import com.example.demo.entity.InteractionCheckResult;

public interface InteractionService {

    InteractionCheckResult checkInteractions(InteractionCheckRequest request);

    InteractionCheckResult getResultById(Long id);
}
