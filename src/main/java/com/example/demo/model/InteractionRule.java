package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ActiveIngredient ingredientA;

    @ManyToOne
    private ActiveIngredient ingredientB;

    private String severity;
    private String description;

    public InteractionRule() {}

    public InteractionRule(ActiveIngredient a, ActiveIngredient b, String severity) {
        this.ingredientA = a;
        this.ingredientB = b;
        this.severity = severity;
    }

    public InteractionRule(ActiveIngredient a, ActiveIngredient b, String severity, String description) {
        this.ingredientA = a;
        this.ingredientB = b;
        this.severity = severity;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getSeverity() { return severity; }

    public void setId(Long id) { this.id = id; }
    public void setSeverity(String severity) { this.severity = severity; }
}
