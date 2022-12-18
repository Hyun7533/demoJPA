package com.example.demoJPA.test.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "SHEET3")
public class Sheet3Entity {

    @Id @GeneratedValue
    private Long id;

    private String a3;

    private String b3;

    private String c3;

    private String d3;


}
