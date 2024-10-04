package com.PorjetMaven.start.models;

import jakarta.persistence.*;



@Entity
@Table(name = "director")
public class Director {

    @Id
    private String id;

    private String name;

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

