package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<Long> medicationIds;

    public InteractionCheckResult() {
    }

    public Long getId() {
        return id;
    }

    public List<Long> getMedicationIds() {
        return medicationIds;
    }

    public void setMedicationIds(List<Long> medicationIds) {
        this.medicationIds = medicationIds;
    }
}
