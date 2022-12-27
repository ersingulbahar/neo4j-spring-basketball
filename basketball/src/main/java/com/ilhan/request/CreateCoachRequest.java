package com.ilhan.request;

import java.util.List;

public class CreateCoachRequest {

    private String name;
    private CreateTeamRequest coaches_for_team;
    private List<CreatePlayerRequest> coaches_for_player;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTeamRequest getCoaches_for_team() {
        return coaches_for_team;
    }

    public void setCoaches_for_team(CreateTeamRequest coaches_for_team) {
        this.coaches_for_team = coaches_for_team;
    }

    public List<CreatePlayerRequest> getCoaches_for_player() {
        return coaches_for_player;
    }

    public void setCoaches_for_player(List<CreatePlayerRequest> coaches_for_player) {
        this.coaches_for_player = coaches_for_player;
    }
}
