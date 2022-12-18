package com.example.demoJPA.member;

import com.example.demoJPA.team.Team;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "MEMBER")
public class Member {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    private String name;

    private String sex;

}
