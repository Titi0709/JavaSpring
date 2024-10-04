package com.PorjetMaven.start.services;

import com.PorjetMaven.start.models.Timing;
import com.PorjetMaven.start.repositories.TimingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimingService {

    @Autowired
    private TimingRepository timingRepository;

    public List<Timing> findAll() {
        return timingRepository.findAll();
    }

    public Optional<Timing> findById(String id) {
        return timingRepository.findById(id);
    }

    public Timing save(Timing timing) {
        return timingRepository.save(timing);
    }

    public void delete(String id) {
        timingRepository.deleteById(id);
    }
}
