package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interactions;

    private LocalDateTime checkedAt = LocalDateTime.now();

    public InteractionCheckResult() {}

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getInteractions() {
        return interactions;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }
}
