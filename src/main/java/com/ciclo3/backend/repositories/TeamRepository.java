package com.ciclo3.backend.repositories;

import com.ciclo3.backend.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT t FROM Team t WHERE t.id = ?1")
    Optional<Team> findById(Long id);
}
