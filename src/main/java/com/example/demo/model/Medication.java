package com.example.demo.entity;
import jakarta.persistence.*;

@Entity

public class Medication {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "name")
    )
    private Set<Course> courses;

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
    public ActiveIngredient(){
    }
    
}
