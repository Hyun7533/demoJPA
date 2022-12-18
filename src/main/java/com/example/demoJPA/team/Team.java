package com.example.demoJPA.team;

import com.example.demoJPA.member.Member;
import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "team")
    @JsonManagedReference
    private List<Member> members = new ArrayList<>();

    private String name;
}
