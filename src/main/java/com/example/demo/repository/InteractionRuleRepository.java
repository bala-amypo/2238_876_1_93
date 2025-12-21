package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InteractionRuleRepository
        extends JpaRepository<InteractionRule, Long> {

    // ✅ REQUIRED by tests
    List<InteractionRule> findByIngredientId(Long ingredientId);

    // ✅ REQUIRED by tests
    Optional<InteractionRule> findRuleBetweenIngredients(Long a, Long b);
}
