package com.keepitreal.keepitreal.model;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String mentalConcern;

    public User(Long id, String name, String mentalConcern) {
        this.id = id;
        this.name = name;
        this.mentalConcern = mentalConcern;
    }

    public User() {
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

    public String getMentalConcern() {
        return mentalConcern;
    }

    public void setMentalConcern(String mentalConcern) {
        this.mentalConcern = mentalConcern;
    }
}
