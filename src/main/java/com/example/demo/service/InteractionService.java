package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;
import java.util.List;
import java.util.Optional;

public interface InteractionService {

    List<InteractionCheckResult> checkInteractions(List<Long> ingredientIds);

    Optional<InteractionCheckResult> getResult(long id); // REQUIRED BY CONTROLLER
}
