package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ActiveIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public ActiveIngredient() {}

    public ActiveIngredient(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // ✅ REQUIRED BY TESTS
    public ActiveIngredient(String name) {
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }

    // ✅ REQUIRED BY SERVICE
    public void setName(String name) {
        this.name = name;
    }
}
