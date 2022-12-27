package com.ilhan.controller;

import com.ilhan.entity.Coach;
import com.ilhan.entity.Player;
import com.ilhan.entity.Team;
import com.ilhan.request.CreateCoachRequest;
import com.ilhan.request.CreatePlayerRequest;
import com.ilhan.request.CreateTeamRequest;
import com.ilhan.service.BasketballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BasketballController {
    @Autowired
    private BasketballService basketballService;

    @PostMapping("/team/create")
    public Team createTeam(@RequestBody CreateTeamRequest createTeamRequest){
        return basketballService.createTeam(createTeamRequest);
    }

    @PostMapping("/player/create")
    public Player createPlayer(@RequestBody CreatePlayerRequest createPlayerRequest){
        return basketballService.createPlayer(createPlayerRequest);
    }

    @PostMapping("/coach/create")
    public Coach createCoach(@RequestBody CreateCoachRequest createCoachRequest){
        return basketballService.createCoach(createCoachRequest);
    }

    @GetMapping("/findByName/{name}")
    public List<Player> findByName(@PathVariable String name){
        return basketballService.getPlayersByName(name);
    }
}
