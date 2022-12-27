package com.ilhan.entity;

import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

@Node(labels = {"PLAYER"})
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private Integer age;
    private Float height;
    private String name;
    @Property(name="number")
    private Integer player_number;
    private Integer weight;
    @Relationship(type = "TEAMMATES", direction = Relationship.Direction.OUTGOING)
    private List<Player> teammates_player;
    @Relationship(type = "PLAYS_FOR", direction = Relationship.Direction.OUTGOING)
    private PlaysForRelationship plays_for_team;

    @Relationship(type = "PLAYED_AGAINST", direction = Relationship.Direction.OUTGOING)
    private List<PlayedAgainstRelationship> played_against_team;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayer_number() {
        return player_number;
    }

    public void setPlayer_number(Integer player_number) {
        this.player_number = player_number;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<Player> getTeammates_player() {
        return teammates_player;
    }

    public void setTeammates_player(List<Player> teammates_player) {
        this.teammates_player = teammates_player;
    }

    public PlaysForRelationship getPlays_for_team() {
        return plays_for_team;
    }

    public void setPlays_for_team(PlaysForRelationship plays_for_team) {
        this.plays_for_team = plays_for_team;
    }

    public List<PlayedAgainstRelationship> getPlayed_against_team() {
        return played_against_team;
    }

    public void setPlayed_against_team(List<PlayedAgainstRelationship> played_against_team) {
        this.played_against_team = played_against_team;
    }
}
