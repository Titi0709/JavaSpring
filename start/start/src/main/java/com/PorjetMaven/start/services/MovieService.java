package com.PorjetMaven.start.services;

import com.PorjetMaven.start.models.Movie;
import com.PorjetMaven.start.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> findById(String id) {
        return movieRepository.findById(id);
    }

    public void delete(String id) {
        movieRepository.deleteById(id);
    }
}
