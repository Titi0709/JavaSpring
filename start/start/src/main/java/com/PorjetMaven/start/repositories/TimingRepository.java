package com.PorjetMaven.start.repositories;

import com.PorjetMaven.start.models.Timing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimingRepository extends JpaRepository<Timing, String> {
}
