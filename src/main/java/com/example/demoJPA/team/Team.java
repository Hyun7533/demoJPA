package com.example.demoJPA.team;

import com.example.demoJPA.member.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TEAM")
public class Team {

    @Id @GeneratedValue
    private Long id;

    @OneToMany
    private List<Member> members;

    private String name;
}
