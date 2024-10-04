package com.PorjetMaven.start.models;

import com.PorjetMaven.start.global.Category;
import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    private String id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}