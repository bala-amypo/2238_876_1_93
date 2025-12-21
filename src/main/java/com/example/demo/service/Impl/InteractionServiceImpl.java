package com.example.demo.service.impl;

import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

@Service
public class InteractionServiceImpl implements InteractionService {

    public InteractionServiceImpl(
            MedicationRepository m,
            InteractionRuleRepository r,
            InteractionCheckResultRepository c
    ) {
    }
}
