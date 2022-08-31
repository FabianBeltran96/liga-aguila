package com.ciclo3.backend.repositories;

import com.ciclo3.backend.models.MatchGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchGame, Long> {
}
