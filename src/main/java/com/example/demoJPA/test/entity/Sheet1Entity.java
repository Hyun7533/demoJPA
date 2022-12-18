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
@Table(name = "SHEET1")
public class Sheet1Entity {

    @Id @GeneratedValue
    private Long id;

    private String a1;

    private String b1;

    private String c1;

    private String d1;
}
