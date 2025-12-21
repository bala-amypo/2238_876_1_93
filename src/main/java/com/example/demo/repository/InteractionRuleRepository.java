package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.*;

public interface InteractionRuleRepository
        extends JpaRepository<InteractionRule, Long> {

    List<InteractionRule> findByIngredientA_Id(long ingredientId);

    @Query("""
        SELECT r FROM InteractionRule r
        WHERE (r.ingredientA.id = :a AND r.ingredientB.id = :b)
           OR (r.ingredientA.id = :b AND r.ingredientB.id = :a)
    """)
    Optional<InteractionRule> findRuleBetweenIngredients(
            @Param("a") long a,
            @Param("b") long b
    );
}
