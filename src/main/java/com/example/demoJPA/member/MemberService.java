package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Long saveMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> searchTeam(Long id) {
        return memberRepository.searchTeam(id);
    }

    public Long deleteMember(Long id) {
        return memberRepository.deleteMember(id);
    }

    public Member searchMemberById(Long id) {
        return memberRepository.searchMemberById(id);
    }

    public Long updateMember(Member member) {
        return memberRepository.updateMember(member);
    }
}
