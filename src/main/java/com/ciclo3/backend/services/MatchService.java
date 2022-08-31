package com.ciclo3.backend.services;

import com.ciclo3.backend.models.MatchGame;
import com.ciclo3.backend.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    private final MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<MatchGame> getMatches() {
        return matchRepository.findAll();
    }

    public void addNewMatch(MatchGame match) {
        matchRepository.save(match);
    }
}
