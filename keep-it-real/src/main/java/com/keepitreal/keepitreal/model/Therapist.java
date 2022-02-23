package com.keepitreal.keepitreal.model;


import javax.persistence.*;

@Entity
@Table(name = "therapist")
public class Therapist {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer yearsOfExperience;

    @Column
    private String medicalBackground;

    public Therapist(Long id, String name, Integer yearsOfExperience, String medicalBackground) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.medicalBackground = medicalBackground;
    }

    public Therapist() {
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

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getMedicalBackground() {
        return medicalBackground;
    }

    public void setMedicalBackground(String medicalBackground) {
        this.medicalBackground = medicalBackground;
    }
}
