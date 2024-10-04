package com.PorjetMaven.start.models;
import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    private String id;

    private String firstname;

    private String name;

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
