package com.example.demoJPA.test.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Sheet3DTO {

    @Id @GeneratedValue
    private Long id;

    private String a3;

    private String b3;

    private String c3;

    private String d3;
}
