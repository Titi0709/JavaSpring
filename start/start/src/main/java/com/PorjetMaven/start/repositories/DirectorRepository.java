package com.PorjetMaven.start.repositories;

import com.PorjetMaven.start.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, String> {
}
