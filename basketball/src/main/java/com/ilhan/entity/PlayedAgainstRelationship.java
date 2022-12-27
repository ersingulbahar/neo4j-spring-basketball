package com.ilhan.entity;

import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties
public class PlayedAgainstRelationship {
    @Id
    @GeneratedValue
    private Long id;
    private Integer assists;
    private Integer minutes;;
    private Integer points;
    private Integer rebounds;
    private Integer turnovers;

    @TargetNode
    private Team team;

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }

    public Integer getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
