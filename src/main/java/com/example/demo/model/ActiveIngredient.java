// src/main/java/com/example/demo/model/ActiveIngredient.java
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ActiveIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public ActiveIngredient() {}

    public ActiveIngredient(String name) {
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}
