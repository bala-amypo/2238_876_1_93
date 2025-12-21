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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {   // optional but useful
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  // 🔥 REQUIRED
        this.name = name;
    }
}
