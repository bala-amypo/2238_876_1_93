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

    private final ActiveIngredientRepository ingredientRepo;
    private final MedicationRepository medicationRepo;

    public CatalogServiceImpl(ActiveIngredientRepository ingredientRepo,
                              MedicationRepository medicationRepo) {
        this.ingredientRepo = ingredientRepo;
        this.medicationRepo = medicationRepo;
    }

    @Override
    public ActiveIngredient addIngredient(String name) {
        if (ingredientRepo.existsByName(name)) {
            return ingredientRepo.findByName(name);
        }
        return ingredientRepo.save(new ActiveIngredient(name));
    }

    @Override
    public Medication addMedication(Medication medication) {
        return medicationRepo.save(medication);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepo.findAll();
    }
}
