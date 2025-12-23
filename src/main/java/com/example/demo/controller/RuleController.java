package com.example.demo.controller;

import com.example.demo.model.InteractionRule;
import com.example.demo.service.RuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rules")
public class RuleController {

    private final RuleService ruleService;

    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    public InteractionRule addRule(@RequestBody InteractionRule rule) {
        return ruleService.addRule(rule);
    }

    @GetMapping
    public List<InteractionRule> getAllRules() {
        return ruleService.getAllRules();
    }

    @GetMapping("/{id}")
    public InteractionRule getRuleById(@PathVariable Long id) {
        return ruleService.getRuleById(id);
    }

    @PutMapping("/{id}")
    public InteractionRule updateRule(@PathVariable Long id, @RequestBody InteractionRule rule) {
        return ruleService.updateRule(id, rule);
    }

    @DeleteMapping("/{id}")
    public void deleteRule(@PathVariable Long id) {
        ruleService.deleteRule(id);
    }
}
