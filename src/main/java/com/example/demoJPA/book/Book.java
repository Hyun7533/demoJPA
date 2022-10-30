package com.example.demoJPA.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Book {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

}
