package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        Team team = em.find(Team.class, 100L);
        member.setTeam(team);
        em.persist(member);
        return member.getId();
    }
}
