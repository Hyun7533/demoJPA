package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/saveMember")
    public Long saveMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    @PostMapping("/searchMembers")
    public List<Member> searchTeam(@RequestBody Team team) {
        return memberService.searchTeam(team.getId());
    }

}
