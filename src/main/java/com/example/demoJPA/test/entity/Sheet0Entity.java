package com.example.demoJPA.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "SHEET0")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sheet0Entity {

    @Id @GeneratedValue
    private Long id;

    private String a0;

    private String b0;

    private String c0;

    private String d0;

    @Builder
    public Sheet0Entity(Long id, String a0, String b0, String c0, String d0) {
        this.id = id;
        this.a0 = a0;
        this.b0 = b0;
        this.c0 = c0;
        this.d0 = d0;
    }
}
