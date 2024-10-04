package com.PorjetMaven.start.repositories;

import com.PorjetMaven.start.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, String> {
}
