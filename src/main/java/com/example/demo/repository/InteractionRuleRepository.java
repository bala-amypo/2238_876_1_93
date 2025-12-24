package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InteractionRuleRepository
        extends JpaRepository<InteractionRule, Long> {

    @Query("""
        select r from InteractionRule r
        where r.ingredientA.id = :ingredientId
           or r.ingredientB.id = :ingredientId
    """)
    List<InteractionRule> findByIngredientId(Long ingredientId);

    @Query("""
        select r from InteractionRule r
        where (r.ingredientA.id = :a and r.ingredientB.id = :b)
           or (r.ingredientA.id = :b and r.ingredientB.id = :a)
    """)
    Optional<InteractionRule> findRuleBetweenIngredients(Long a, Long b);
}
