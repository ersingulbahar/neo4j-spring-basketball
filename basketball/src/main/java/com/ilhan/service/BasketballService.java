package com.ilhan.service;

import com.ilhan.entity.*;
import com.ilhan.repository.*;
import com.ilhan.request.CreateCoachRequest;
import com.ilhan.request.CreatePlayerRequest;
import com.ilhan.request.CreateTeamRequest;
import com.ilhan.request.UpdatePlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketballService {
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    CoachRepository coachRepository;

    public Team createTeam(CreateTeamRequest createTeamRequest){
        Team team = new Team();
        team.setName(createTeamRequest.getName());

        teamRepository.save(team);
        return team;
    }

    public Player createPlayer(CreatePlayerRequest createPlayerRequest){
        Player player = new Player();
        player.setName(createPlayerRequest.getName());
        player.setPlayer_number(createPlayerRequest.getPlayer_number());
        player.setAge(createPlayerRequest.getAge());
        player.setHeight(createPlayerRequest.getHeight());
        player.setWeight(createPlayerRequest.getWeight());

        if(createPlayerRequest.getPlays_for_team() != null){
            CreateTeamRequest createTeamRequest = createPlayerRequest.getPlays_for_team();
            Team team = new Team();
            team.setName(createTeamRequest.getName());
            teamRepository.save(team);

            PlaysForRelationship playsForRelationship = new PlaysForRelationship();
            playsForRelationship.setTeam(team);
            playsForRelationship.setSalary(createTeamRequest.getSalary());
            player.setPlays_for_team(playsForRelationship);
        }
        List<PlayedAgainstRelationship> playedAgainstRelationshipList = new ArrayList<>();
        if(createPlayerRequest.getPlayed_against_team() != null){
            for(CreateTeamRequest createTeamRequest : createPlayerRequest.getPlayed_against_team()){
                Team team = new Team();
                team.setName(createTeamRequest.getName());

                teamRepository.save(team);

                PlayedAgainstRelationship relationship = new PlayedAgainstRelationship();
                relationship.setAssists(createTeamRequest.getAssists());
                relationship.setMinutes(createTeamRequest.getMinutes());
                relationship.setPoints(createTeamRequest.getPoints());
                relationship.setRebounds(createTeamRequest.getRebounds());
                relationship.setTurnovers(createTeamRequest.getTurnovers());
                relationship.setTeam(team);
                playedAgainstRelationshipList.add(relationship);
            }
        }
        player.setPlayed_against_team(playedAgainstRelationshipList);
        playerRepository.save(player);
        return player;
    }

    public Coach createCoach(CreateCoachRequest createCoachRequest){
        Coach coach = new Coach();
        coach.setName(createCoachRequest.getName());

        Team coaches_for_team = new Team();
        coaches_for_team.setName(createCoachRequest.getCoaches_for_team().getName());
        teamRepository.save(coaches_for_team);

        List<Player> coaches_for_player = new ArrayList<Player>();
        if(createCoachRequest.getCoaches_for_player() != null){
            for(CreatePlayerRequest request : createCoachRequest.getCoaches_for_player()){
                Player player = new Player();
                player.setName(request.getName());
                player.setAge(request.getAge());
                player.setHeight(request.getHeight());
                player.setWeight(request.getWeight());
                player.setPlayer_number(request.getPlayer_number());

                playerRepository.save(player);
                coaches_for_player.add(player);
            }
        }
        coach.setCoaches_for_player(coaches_for_player);
        coach.setCoaches_for_team(coaches_for_team);
        coachRepository.save(coach);

        return coach;
    }

    public List<Player> getPlayersByName(String name) {
        return playerRepository.findByName(name);
    }

}
