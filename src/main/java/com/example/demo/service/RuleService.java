// src/main/java/com/example/demo/service/RuleService.java
package com.example.demo.service;

import com.example.demo.model.InteractionRule;
import java.util.List;

public interface RuleService {
    List<InteractionRule> getRulesByIngredient(Long ingredientId);
    InteractionRule addRule(InteractionRule rule);
}
