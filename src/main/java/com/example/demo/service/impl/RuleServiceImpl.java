package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.service.RuleService;
import java.util.*;

public class RuleServiceImpl implements RuleService {

    public RuleServiceImpl() {}

    public InteractionRule addRule(InteractionRule rule) {
        return rule;
    }

    public List<InteractionRule> getAllRules() {
        return new ArrayList<>();
    }
}
