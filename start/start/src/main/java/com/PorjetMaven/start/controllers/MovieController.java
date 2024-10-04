package com.PorjetMaven.start.controllers;

import com.PorjetMaven.start.models.Movie;
import com.PorjetMaven.start.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.findAll();
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable String id) {
        return movieService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable String id, @RequestBody Movie movie) {
        if (movieService.findById(id).isPresent()) {
            movie.setId(id);
            return ResponseEntity.ok(movieService.save(movie));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable String id) {
        movieService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
