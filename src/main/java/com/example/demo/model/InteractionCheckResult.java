package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interactions;
    private String severity;

    private LocalDateTime checkedAt;

    public InteractionCheckResult() {}

    // ✅ REQUIRED by tests
    public InteractionCheckResult(String interactions, String severity) {
        this.interactions = interactions;
        this.severity = severity;
        this.checkedAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }   // ✅ REQUIRED

    public String getInteractions() { return interactions; }
    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public LocalDateTime getCheckedAt() { return checkedAt; }
    public void setCheckedAt(LocalDateTime checkedAt) {
        this.checkedAt = checkedAt;
    }
}
