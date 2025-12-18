// package com.example.demo.model;

// import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;

// @Entity
// @Table(
//     name = "interaction_rules",
//     uniqueConstraints = {
//         @UniqueConstraint(columnNames = {"ingredient_a_id", "ingredient_b_id"})
//     }
// )
// public class InteractionRule {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne(optional = false)
//     @JoinColumn(name = "ingredient_a_id", nullable = false)
//     private ActiveIngredient ingredientA;

//     @ManyToOne(optional = false)
//     @JoinColumn(name = "ingredient_b_id", nullable = false)
//     private ActiveIngredient ingredientB;

//     @Enumerated(EnumType.STRING)
//     @Column(nullable = false)
//     private Severity severity;

//     @NotBlank
//     @Column(nullable = false, length = 1000)
//     private String description;

//     public InteractionRule() {
//     }

//     public InteractionRule(ActiveIngredient ingredientA,
//                            ActiveIngredient ingredientB,
//                            Severity severity,
//                            String description) {
//         this.ingredientA = ingredientA;
//         this.ingredientB = ingredientB;
//         this.severity = severity;
//         this.description = description;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public ActiveIngredient getIngredientA() {
//         return ingredientA;
//     }

//     public void setIngredientA(ActiveIngredient ingredientA) {
//         this.ingredientA = ingredientA;
//     }

//     public ActiveIngredient getIngredientB() {
//         return ingredientB;
//     }

//     public void setIngredientB(ActiveIngredient ingredientB) {
//         this.ingredientB = ingredientB;
//     }

//     public Severity getSeverity() {
//         return severity;
//     }

//     public void setSeverity(Severity severity) {
//         this.severity = severity;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }
// }
