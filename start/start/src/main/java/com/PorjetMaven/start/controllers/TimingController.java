package com.PorjetMaven.start.controllers;
import com.PorjetMaven.start.models.Timing;
import com.PorjetMaven.start.services.TimingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timings")
public class TimingController {

    @Autowired
    private TimingService timingService;

    @GetMapping
    public List<Timing> getAllTimings() {
        return timingService.findAll();
    }

    @PostMapping
    public Timing createTiming(@RequestBody Timing timing) {
        return timingService.save(timing);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Timing> getTimingById(@PathVariable String id) {
        return timingService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Timing> updateTiming(@PathVariable String id, @RequestBody Timing timing) {
        if (timingService.findById(id).isPresent()) {
            timing.setId(id);
            return ResponseEntity.ok(timingService.save(timing));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTiming(@PathVariable String id) {
        timingService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
