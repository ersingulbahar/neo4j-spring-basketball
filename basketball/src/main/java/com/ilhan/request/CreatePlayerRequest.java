package com.ilhan.request;

import org.springframework.data.neo4j.core.schema.Property;

import java.util.List;

public class CreatePlayerRequest {
    private Integer age;
    private Float height;
    private String name;
    private Integer player_number;
    private Integer weight;
    private List<CreatePlayerRequest> teammates_player;
    private CreateTeamRequest plays_for_team;
    private List<CreateTeamRequest> played_against_team;

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

    public List<CreatePlayerRequest> getTeammates_player() {
        return teammates_player;
    }

    public void setTeammates_player(List<CreatePlayerRequest> teammates_player) {
        this.teammates_player = teammates_player;
    }

    public CreateTeamRequest getPlays_for_team() {
        return plays_for_team;
    }

    public void setPlays_for_team(CreateTeamRequest plays_for_team) {
        this.plays_for_team = plays_for_team;
    }

    public List<CreateTeamRequest> getPlayed_against_team() {
        return played_against_team;
    }

    public void setPlayed_against_team(List<CreateTeamRequest> played_against_team) {
        this.played_against_team = played_against_team;
    }
}
