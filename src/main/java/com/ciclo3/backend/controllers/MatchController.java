package com.ciclo3.backend.controllers;

import com.ciclo3.backend.models.MatchGame;
import com.ciclo3.backend.services.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<MatchGame> getMatches() {
        return matchService.getMatches();
    }

    @PostMapping
    public void addNewMatch(@RequestBody MatchGame match){
        matchService.addNewMatch(match);
    }
}
