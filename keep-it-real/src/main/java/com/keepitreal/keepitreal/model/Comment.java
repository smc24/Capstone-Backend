package com.keepitreal.keepitreal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String therapistFeedback;

    public Comment(Long id, String therapistFeedback) {
        this.id = id;
        this.therapistFeedback = therapistFeedback;
    }

    public Comment() {
    }

    @ManyToOne
    @JoinColumn(name = " therapist_id", referencedColumnName = "id")
    @JsonIgnore
    private Therapist therapist;

    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }

    @ManyToOne
    @JoinColumn(name = "posts_id", referencedColumnName = "id")
    @JsonIgnore
    private Posts user;

    public Posts getUser() {
        return user;
    }

    public void setUser(Posts user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTherapistFeedback() {
        return therapistFeedback;
    }

    public void setTherapistFeedback(String therapistFeedback) {
        this.therapistFeedback = therapistFeedback;
    }
}
