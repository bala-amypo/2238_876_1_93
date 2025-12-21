// src/test/java/com/example/demo/DrugInteractionCheckerTest.java
package com.example.demo;

import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.impl.InteractionServiceImpl;
import com.example.demo.service.impl.RuleServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DrugInteractionCheckerTest {

    @Mock
    private InteractionRuleRepository interactionRuleRepository;

    @InjectMocks
    private RuleServiceImpl ruleService;

    @InjectMocks
    private InteractionServiceImpl interactionService;
}
