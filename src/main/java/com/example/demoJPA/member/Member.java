package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    @JsonBackReference
    private Team team;

    private String name;

    private String sex;

    @Builder
    public Member(Long id, Team team, String name, String sex) {
        this.id = id;
        this.team = team;
        this.name = name;
        this.sex = sex;
    }
}
