package com.PorjetMaven.start.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Timing {
    @Id
    private String id;
    private int duration; // Durée du film en minutes

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
