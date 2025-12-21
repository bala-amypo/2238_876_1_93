package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;

import java.util.Optional;

public interface InteractionService {
    Optional<InteractionCheckResult> getResult(long id);
}
