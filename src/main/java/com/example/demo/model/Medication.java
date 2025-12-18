package com.example.demo.entity;
import jakarta.persistence.*;

@Entity

public class Medication {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    @Entity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;
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

    public ActiveIngredient(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public ActiveIngredient(){
    }
    
}
