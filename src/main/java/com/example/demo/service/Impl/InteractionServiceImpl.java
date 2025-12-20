package com.example.demo.service;

import com.example.demo.dto.InteractionCheckRequest;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final MedicationRepository medicationRepository;
    private final InteractionRuleRepository ruleRepository;
    private final InteractionCheckResultRepository resultRepository;

    public InteractionServiceImpl(MedicationRepository medicationRepository,
                                  InteractionRuleRepository ruleRepository,
                                  InteractionCheckResultRepository resultRepository) {
        this.medicationRepository = medicationRepository;
        this.ruleRepository = ruleRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public InteractionCheckResult checkInteractions(InteractionCheckRequest request) {

        List<Medication> medications =
                medicationRepository.findAllById(request.getMedicationIds());

        Set<ActiveIngredient> ingredients = new HashSet<>();
        medications.forEach(m -> ingredients.addAll(m.getIngredients()));

        List<InteractionRule> rules = ruleRepository.findAll();
        StringBuilder summary = new StringBuilder();

        for (InteractionRule rule : rules) {
            if (ingredients.contains(rule.getIngredientA()) &&
                ingredients.contains(rule.getIngredientB())) {

                summary.append("Interaction: ")
                       .append(rule.getIngredientA().getName())
                       .append(" + ")
                       .append(rule.getIngredientB().getName())
                       .append(" | Severity: ")
                       .append(rule.getSeverity())
                       .append(" | ")
                       .append(rule.getDescription())
                       .append("\n");
            }
        }

        if (summary.length() == 0) {
            summary.append("No interactions found");
        }

        return resultRepository.save(
                new InteractionCheckResult(summary.toString())
        );
    }

    @Override
    public InteractionCheckResult getResultById(Long id) {
        return resultRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
