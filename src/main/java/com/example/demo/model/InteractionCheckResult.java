package com.example.demo.model;

import java.time.LocalDateTime;

public class InteractionCheckResult {

    private Long id;
    private String medications;
    private String interactions;
    private LocalDateTime checkedAt = LocalDateTime.now();

    public InteractionCheckResult() {}

    public InteractionCheckResult(String medications, String interactions) {
        this.medications = medications;
        this.interactions = interactions;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMedications() { return medications; }
    public void setMedications(String medications) { this.medications = medications; }

    public String getInteractions() { return interactions; }
    public void setInteractions(String interactions) { this.interactions = interactions; }

    public LocalDateTime getCheckedAt() { return checkedAt; }
}
