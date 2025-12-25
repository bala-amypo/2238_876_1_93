package com.example.demo.service.impl;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final MedicationRepository medicationRepository;
    private final ActiveIngredientRepository ingredientRepository;

    public CatalogServiceImpl(MedicationRepository medicationRepository,
                              ActiveIngredientRepository ingredientRepository) {
        this.medicationRepository = medicationRepository;
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Medication addMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    @Override
    public ActiveIngredient addIngredient(String name) {
        ActiveIngredient ingredient = new ActiveIngredient();
        ingredient.setName(name);
        return ingredientRepository.save(ingredient);
    }
}
