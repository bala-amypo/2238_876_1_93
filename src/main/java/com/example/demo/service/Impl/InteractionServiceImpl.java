package com.example.demo.service.impl;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.InteractionRule;
import com.example.demo.model.Medication;
import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.InteractionService;

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
    public String checkInteractions(List<Long> medicationIds) {

        List<Medication> meds =
                medicationRepository.findAllById(medicationIds);

        Set<ActiveIngredient> ingredients = new HashSet<>();
        for (Medication m : meds) {
            ingredients.addAll(m.getIngredients());
        }

        List<String> interactions = new ArrayList<>();
        List<ActiveIngredient> list = new ArrayList<>(ingredients);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                InteractionRule rule =
                        ruleRepository.findRuleBetweenIngredients(
                                list.get(i).getId(),
                                list.get(j).getId()
                        );
                if (rule != null) {
                    interactions.add(rule.getDescription());
                }
            }
        }

        String result =
                interactions.isEmpty()
                        ? "No interactions found"
                        : String.join(", ", interactions);

        InteractionCheckResult saved =
                new InteractionCheckResult(
                        medicationIds.toString(), result);

        resultRepository.save(saved);
        return result;
    }
}
