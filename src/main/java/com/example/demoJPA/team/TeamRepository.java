package com.example.demoJPA.team;

import com.example.demoJPA.member.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TeamRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Team team) {
        em.persist(team);
        return team.getId();
    }

    public Team find(Long id) {
        return em.find(Team.class, id);
    }

}
