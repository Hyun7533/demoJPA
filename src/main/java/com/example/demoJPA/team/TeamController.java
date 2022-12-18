package com.example.demoJPA.team;

import com.example.demoJPA.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @PostMapping("/saveTeam")
    public Long saveTeam(@RequestBody Team team) {
        return teamService.save(team);
    }

    @PostMapping("/findTeam")
    public Team findTeam(@RequestBody Team team) {
        return teamService.findById(team);
    }



}
