package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;
import java.util.List;

public interface InteractionService {

    List<InteractionCheckResult> checkInteractions(List<Long> ingredientIds);
}
