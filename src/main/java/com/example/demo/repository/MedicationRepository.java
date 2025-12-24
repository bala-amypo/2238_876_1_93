package com.example.demo.repository;

import com.example.demo.model.Medication;
import java.util.List;
import java.util.Optional;

public interface MedicationRepository {

    Medication save(Medication medication);

    Optional<Medication> findById(long id);

    List<Medication> findAll();
}
