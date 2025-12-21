package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String severity;
    private String message;

    public InteractionCheckResult() {}

    public InteractionCheckResult(String severity, String message) {
        this.severity = severity;
        this.message = message;
    }

    public Long getId() { return id; }
    public String getSeverity() { return severity; }
    public String getMessage() { return message; }

    public void setId(Long id) {
        this.id = id;
    }
}
