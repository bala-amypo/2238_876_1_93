// src/main/java/com/example/demo/model/InteractionRule.java
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

    private String description;

    public InteractionRule() {}

    public InteractionRule(ActiveIngredient a, ActiveIngredient b, String description) {
        this.ingredientA = a;
        this.ingredientB = b;
        this.description = description;
    }

    public Long getId() { return id; }
    public ActiveIngredient getIngredientA() { return ingredientA; }
    public ActiveIngredient getIngredientB() { return ingredientB; }
    public String getDescription() { return description; }
}
