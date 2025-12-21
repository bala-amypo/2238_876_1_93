// src/main/java/com/example/demo/model/InteractionCheckResult.java
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String result;

    public InteractionCheckResult() {}

    public InteractionCheckResult(String result) {
        this.result = result;
    }

    public Long getId() { return id; }
    public String getResult() { return result; }
}
