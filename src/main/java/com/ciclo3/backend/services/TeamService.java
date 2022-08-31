package com.ciclo3.backend.services;

import com.ciclo3.backend.models.Team;
import com.ciclo3.backend.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;
    private Team team;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Optional<Team> getTeam(Long id) {
        Optional<Team> teamFind = teamRepository.findById(id);
        return teamFind;
    }

    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    public void addNewTeam(Team team) {
        teamRepository.save(team);
    }

}
