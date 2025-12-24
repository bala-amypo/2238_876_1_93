package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import java.util.List;
import java.util.Optional;

public interface InteractionRuleRepository {

    Optional<InteractionRule> findById(Long id);

    List<InteractionRule> findAll();
}
