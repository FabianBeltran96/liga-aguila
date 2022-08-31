package com.ciclo3.backend.controllers;

import com.ciclo3.backend.models.Team;
import com.ciclo3.backend.services.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping(path = "{teamId}")
    public Optional<Team> getTeam(@PathVariable("teamId") Long teamId) {
        return teamService.getTeam(teamId);
    }

    @GetMapping
    public List<Team> getTeams() {
        return teamService.getTeams();
    }

    @PostMapping
    public void addNewTeam(@RequestBody Team team) {
        teamService.addNewTeam(team);
    }

}
