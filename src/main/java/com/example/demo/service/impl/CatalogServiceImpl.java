package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.service.CatalogService;
import java.util.*;

public class CatalogServiceImpl implements CatalogService {

    public CatalogServiceImpl() {}

    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {
        return ingredient;
    }

    public Medication addMedication(Medication medication) {
        return medication;
    }

    public List<Medication> getAllMedications() {
        return new ArrayList<>();
    }
}
