package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interactions;
    private String checkedBy;

    private LocalDateTime checkedAt = LocalDateTime.now();

    public InteractionCheckResult() {}

    // REQUIRED constructor
    public InteractionCheckResult(String interactions, String checkedBy) {
        this.interactions = interactions;
        this.checkedBy = checkedBy;
    }

    public Long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getInteractions() { return interactions; }
    public void setInteractions(String interactions) { this.interactions = interactions; }

    public String getCheckedBy() { return checkedBy; }
    public void setCheckedBy(String checkedBy) { this.checkedBy = checkedBy; }

    public LocalDateTime getCheckedAt() { return checkedAt; }
}
