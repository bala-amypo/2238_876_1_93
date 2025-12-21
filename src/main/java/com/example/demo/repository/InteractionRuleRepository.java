// src/main/java/com/example/demo/repository/InteractionRuleRepository.java
package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {

    List<InteractionRule> findByIngredientId(Long ingredientId);
}
