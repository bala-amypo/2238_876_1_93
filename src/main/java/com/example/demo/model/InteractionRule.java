package com.example.demo.model;
import jakarta.persistence.*;

@Entity

public class InteractionRule {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "name")
    )
    private Set<Course> courses;

    private String name;
    private String email;
    private String password;
    private String role;

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

    public String getStumail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public InteractionRule(Long id, String name, String mail, String password,String role) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.role=role;
    }
    public InteractionRule(){
    }
    
}
