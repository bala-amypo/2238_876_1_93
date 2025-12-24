package com.example.demo.service.impl;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

    @Override
    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {
        return ingredient;
    }

    @Override
    public Medication addMedication(Medication medication) {
        return medication;
    }
}
