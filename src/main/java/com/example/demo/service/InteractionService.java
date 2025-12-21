package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;
import java.util.List;
import java.util.Optional;

public interface InteractionService {

    InteractionCheckResult checkInteractions(List<Long> ingredientIds);

    Optional<InteractionCheckResult> getResult(Long id);
}
