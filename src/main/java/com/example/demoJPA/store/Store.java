package com.example.demoJPA.store;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name = "T_STOR")
@Data
public class Store {

    @Id
    @Column(name = "STOR_CD", length = 12)
    private String stor_cd;

    @Column(name = "STOR_NM", length = 50)
    private String stor_nm;

    @Column(name = "ADDR", length = 100)
    private String addr;

    @Column(name = "TEL", length = 20)
    private String tel;

    @Column(name = "MAIN_PHOTO")
    private String main_photo;


}
