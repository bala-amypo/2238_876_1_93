package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import java.util.List;
import java.util.Optional;

public interface InteractionRuleRepository {

    InteractionRule save(InteractionRule rule);

    Optional<InteractionRule> findById(long id);

    List<InteractionRule> findByIngredientId(long ingredientId);

    Optional<InteractionRule> findRuleBetweenIngredients(long a, long b);
}
