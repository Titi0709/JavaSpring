package com.PorjetMaven.start.services;

import com.PorjetMaven.start.models.Actor;
import com.PorjetMaven.start.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    public Optional<Actor> findById(String id) {
        return actorRepository.findById(id);
    }

    public void delete(String id) {
        actorRepository.deleteById(id);
    }
}

