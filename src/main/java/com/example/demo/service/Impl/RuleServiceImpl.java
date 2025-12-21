// src/main/java/com/example/demo/service/impl/RuleServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository interactionRuleRepository;

    public RuleServiceImpl(InteractionRuleRepository interactionRuleRepository) {
        this.interactionRuleRepository = interactionRuleRepository;
    }
}
