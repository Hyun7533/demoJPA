package com.example.demoJPA.invtReprtErr;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "REITS_INVT_REPRT_ERR")
public class InvtReprtErr {

    @Id @GeneratedValue
    private Long id;

    private String knd;

    private String cn;
}
