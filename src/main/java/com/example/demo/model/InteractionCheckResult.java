package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "interaction_check_results")
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Comma-separated medication names
     * Example: "Aspirin,Warfarin,Ibuprofen"
     */
    @Column(nullable = false, length = 1000)
    private String medications;

    /**
     * Structured JSON summary of interactions
     * Stored as TEXT (or JSON if your DB supports it)
     */
    @Column(nullable = false, columnDefinition = "TEXT")
    private String interactions;

    @Column(nullable = false, updatable = false)
    private LocalDateTime checkedAt;

    @PrePersist
    protected void onCreate() {
        this.checkedAt = LocalDateTime.now();
    }

    // Constructors
    public InteractionCheckResult() {}

    public InteractionCheckResult(String medications, String interactions) {
        this.medications = medications;
        this.interactions = interactions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }
}
