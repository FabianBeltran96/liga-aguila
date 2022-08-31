package com.ciclo3.backend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
public class MatchGame {

    @Id
    @SequenceGenerator(name = "match_sequence", sequenceName = "match_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_sequence")
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "localTeamId", referencedColumnName = "id")
    private Team localTeam;

    @Getter
    @Setter
    private int goals_local;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visitorTeamId", referencedColumnName = "id")
    private Team visitorTeam;

    @Getter
    @Setter
    private int goals_visitor;

    @Getter
    @Setter
    private String dateMatch;


}
