package com.PorjetMaven.start.controllers;

import com.PorjetMaven.start.models.Actor;
import com.PorjetMaven.start.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.findAll();
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.save(actor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable String id) {
        return actorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Actor> updateActor(@PathVariable String id, @RequestBody Actor actor) {
        if (actorService.findById(id).isPresent()) {
            actor.setId(id);
            return ResponseEntity.ok(actorService.save(actor));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActor(@PathVariable String id) {
        actorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

