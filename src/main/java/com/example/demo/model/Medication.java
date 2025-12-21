// src/main/java/com/example/demo/model/Medication.java
package com.example.demo.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private Set<ActiveIngredient> activeIngredients = new HashSet<>();

    public Medication() {}

    public Medication(String name) {
        this.name = name;
    }

    public Medication(String name, Set<ActiveIngredient> activeIngredients) {
        this.name = name;
        this.activeIngredients = activeIngredients;
    }

    public void addIngredient(ActiveIngredient ingredient) {
        activeIngredients.add(ingredient);
    }

    public void removeIngredient(ActiveIngredient ingredient) {
        activeIngredients.remove(ingredient);
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Set<ActiveIngredient> getActiveIngredients() { return activeIngredients; }
}
