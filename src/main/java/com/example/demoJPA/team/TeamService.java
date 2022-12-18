package com.example.demoJPA.team;


import com.example.demoJPA.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public Long save(Team team) {
        return teamRepository.save(team);
    }

    public Team findById(Team team) {
        return teamRepository.find(team.getId());
    }
}
