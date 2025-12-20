package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "interaction_rule",
    uniqueConstraints = @UniqueConstraint(
        columnNames = { "ingredient_a_id", "ingredient_b_id" }
    )
)
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ingredient_a_id")
    private ActiveIngredient ingredientA;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ingredient_b_id")
    private ActiveIngredient ingredientB;

    @Column(nullable = false)
    private String severity; // MINOR / MODERATE / MAJOR

    @Column(nullable = false, length = 500)
    private String description;

    public InteractionRule() {
    }

    public InteractionRule(
            ActiveIngredient ingredientA,
            ActiveIngredient ingredientB,
            String severity,
            String description
    ) {
        if (ingredientA.getId() < ingredientB.getId()) {
            this.ingredientA = ingredientA;
            this.ingredientB = ingredientB;
        } else {
            this.ingredientA = ingredientB;
            this.ingredientB = ingredientA;
        }
        this.severity = severity;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public ActiveIngredient getIngredientA() {
        return ingredientA;
    }

    public ActiveIngredient getIngredientB() {
        return ingredientB;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
