package com.example.demo.service.impl;

import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final ActiveIngredientRepository activeIngredientRepository;
    private final MedicationRepository medicationRepository;

    public CatalogServiceImpl(
            ActiveIngredientRepository activeIngredientRepository,
            MedicationRepository medicationRepository
    ) {
        this.activeIngredientRepository = activeIngredientRepository;
        this.medicationRepository = medicationRepository;
    }
}
