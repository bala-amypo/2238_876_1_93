package com.example.demo.repository;

import com.example.demo.model.Medication;
import java.util.List;
import java.util.Optional;

public interface MedicationRepository {

    Optional<Medication> findById(Long id);

    List<Medication> findAll();
}
