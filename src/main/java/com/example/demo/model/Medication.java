package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "medication")
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
        name = "medication_active_ingredient",
        joinColumns = @JoinColumn(name = "medication_id"),
        inverseJoinColumns = @JoinColumn(name = "active_ingredient_id")
    )
    @NotEmpty(message = "Medication must include at least one active ingredient")
    private Set<ActiveIngredient> ingredients = new HashSet<>();

    public Medication() {
    }

    public Medication(String name, Set<ActiveIngredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ActiveIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<ActiveIngredient> ingredients) {
        this.ingredients = ingredients;
    }
}
