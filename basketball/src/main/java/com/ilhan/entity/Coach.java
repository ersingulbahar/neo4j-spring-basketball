package com.ilhan.entity;

import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

@Node(labels = {"COACH"})
public class Coach {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Relationship(type = "COACHES_FOR", direction = Relationship.Direction.OUTGOING)
    private Team coaches_for_team;

    @Relationship(type = "COACHES", direction = Relationship.Direction.OUTGOING)
    private List<Player> coaches_for_player;

    public Team getCoaches_for_team() {
        return coaches_for_team;
    }

    public void setCoaches_for_team(Team coaches_for_team) {
        this.coaches_for_team = coaches_for_team;
    }

    public String getName() {
        return name;
    }

    public List<Player> getCoaches_for_player() {
        return coaches_for_player;
    }

    public void setCoaches_for_player(List<Player> coaches_for_player) {
        this.coaches_for_player = coaches_for_player;
    }

    public void setName(String name) {
        this.name = name;
    }
}
