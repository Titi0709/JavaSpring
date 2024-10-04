package com.PorjetMaven.start.controllers;

import com.PorjetMaven.start.models.Director;
import com.PorjetMaven.start.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directors")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping
    public List<Director> getAllDirectors() {
        return directorService.findAll();
    }

    @PostMapping
    public Director createDirector(@RequestBody Director director) {
        return directorService.save(director);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Director> getDirectorById(@PathVariable String id) {
        return directorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Director> updateDirector(@PathVariable String id, @RequestBody Director director) {
        if (directorService.findById(id).isPresent()) {
            director.setId(id);
            return ResponseEntity.ok(directorService.save(director));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDirector(@PathVariable String id) {
        directorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
