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
@Table(name = "SHEET2")
public class Sheet2Entity {

    @Id @GeneratedValue
    private Long id;

    private String a2;

    private String b2;

    private String c2;

    private String d2;
}
