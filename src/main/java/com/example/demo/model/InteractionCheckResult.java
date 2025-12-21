package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String result;
    private String severity;

    public InteractionCheckResult() {}

    public InteractionCheckResult(String result) {
        this.result = result;
    }

    public InteractionCheckResult(String result, String severity) {
        this.result = result;
        this.severity = severity;
    }

    public Long getId() { return id; }
    public String getSeverity() { return severity; }

    public void setId(Long id) { this.id = id; }
    public void setSeverity(String severity) { this.severity = severity; }
}
