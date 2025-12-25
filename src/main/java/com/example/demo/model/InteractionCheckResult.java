package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "interaction_check_results")
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Comma-separated medication IDs or names
     * (tests treat this as a String)
     */
    @Column(nullable = false)
    private String medications;

    /**
     * Interaction result message
     */
    @Column(nullable = false, length = 2000)
    private String interactions;

    /**
     * When the check was performed
     */
    private LocalDateTime checkedAt;

    // ✅ REQUIRED BY JPA
    public InteractionCheckResult() {
        this.checkedAt = LocalDateTime.now();
    }

    // ✅ REQUIRED BY TESTS
    public InteractionCheckResult(String medications, String interactions) {
        this.medications = medications;
        this.interactions = interactions;
        this.checkedAt = LocalDateTime.now();
    }

    // ---------- Getters & Setters ----------

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

    public void setCheckedAt(LocalDateTime checkedAt) {
        this.checkedAt = checkedAt;
    }
}
