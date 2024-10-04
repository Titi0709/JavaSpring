package com.PorjetMaven.start.services;

import com.PorjetMaven.start.models.Director;
import com.PorjetMaven.start.repositories.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> findAll() {
        return directorRepository.findAll();
    }

    public Director save(Director director) {
        return directorRepository.save(director);
    }

    public Optional<Director> findById(String id) {
        return directorRepository.findById(id);
    }

    public void delete(String id) {
        directorRepository.deleteById(id);
    }
}
