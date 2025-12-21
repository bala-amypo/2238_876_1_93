// src/main/java/com/example/demo/service/impl/InteractionServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionRuleRepository repository;

    public InteractionServiceImpl(InteractionRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getResult(long ruleId) {
        return repository.findById(ruleId)
                .map(r -> r.getResult())
                .orElse(null);
    }
}
