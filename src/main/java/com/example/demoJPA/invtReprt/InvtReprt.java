package com.example.demoJPA.invtReprt;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "REITS_INVT_REPRT")
public class InvtReprt {

    @Id @GeneratedValue
    private Long id;

    private String jsonReprt;

    private String knd;

}
