// src/main/java/com/example/demo/service/impl/RuleServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository repository;

    public RuleServiceImpl(InteractionRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<InteractionRule> getRulesByIngredient(Long ingredientId) {
        return repository.findByIngredientA_IdOrIngredientB_Id(ingredientId, ingredientId);
    }

    @Override
    public InteractionRule addRule(InteractionRule rule) {
        return repository.save(rule);
    }
}
