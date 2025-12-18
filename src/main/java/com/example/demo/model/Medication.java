package com.example.demo.model;
import jakarta.persistence.*;

@Entity

public class Medication {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(
        name = "medication_ingredient",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "name")
    )
    private Set<ActiveIngredient> ingredients;

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

    public ActiveIngredient(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Set<ActiveIngredient> getIngredients() {
        return ingredients;
    }

    public ActiveIngredient(){
    }
    
}
