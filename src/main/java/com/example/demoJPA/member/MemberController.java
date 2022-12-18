package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/deleteMember")
    public Long deleteMember(@RequestBody Member member) {
        return memberService.deleteMember(member.getId());
    }

    @PostMapping("/searchMemberById")
    public Member searchMemberById(@RequestBody Member member) {
        return memberService.searchMemberById(member.getId());
    }

    @PutMapping("/updateMember")
    public Long updateMember(@RequestBody Member member) {
        return memberService.updateMember(member);
    }



}
