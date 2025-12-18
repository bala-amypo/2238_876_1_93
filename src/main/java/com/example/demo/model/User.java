package com.example.demo.entity;

import jakarta.persistence.*;

@Entity

public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
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

    public String getnName() {
        return stuname;
    }
    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
    public String getStumail() {
        return stumail;
    }
    public void setStumail(String stumail) {
        this.stumail = stumail;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int id, String stuname, String stumail, float cgpa) {
        this.id = id;
        this.stuname = stuname;
        this.stumail = stumail;
        this.cgpa = cgpa;
    }
    public Student() {
    }
    
}
