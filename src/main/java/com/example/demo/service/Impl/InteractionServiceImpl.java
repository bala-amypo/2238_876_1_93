package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.InteractionService;

@Service
public class InteractionServiceImpl implements InteractionService {

    private MedicationRepository medicationRepository;
    private InteractionRuleRepository ruleRepository;
    private InteractionCheckResultRepository resultRepository;

    public InteractionServiceImpl() {
    }

    public InteractionServiceImpl(MedicationRepository medicationRepository,
                                  InteractionRuleRepository ruleRepository,
                                  InteractionCheckResultRepository resultRepository) {
        this.medicationRepository = medicationRepository;
        this.ruleRepository = ruleRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        InteractionCheckResult result = new InteractionCheckResult();
        return resultRepository.save(result);
    }

    @Override
    public InteractionCheckResult getResult(Long id) {
        return resultRepository.findById(id).orElse(null);
    }
}
