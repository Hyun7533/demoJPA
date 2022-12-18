package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        Team team = em.find(Team.class, 1L);
        Member member1 = Member.builder()
                .name(member.getName())
                .sex(member.getSex())
                .team(team).build();
        em.persist(member1);

        return member1.getId();
    }

    public List<Member> searchTeam(Long id) {
        Team findTeam = em.find(Team.class, id);
        List<Member> members = findTeam.getMembers();
        return members;
    }

    public Long deleteMember(Long id) {
        Member member = em.find(Member.class, id);
        em.remove(member);
        return member.getId();
    }

    public Member searchMemberById(Long id) {
        return em.find(Member.class, id);
    }

    public Long updateMember(Member member) {
        Member member1 = em.find(Member.class, member.getId());
//        member1.setName(member.getName());
//        member1.setSex(member.getSex());
        em.persist(member1);
        return member1.getId();
    }
}
