package com.example.demoJPA.store;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name = "T_STOR")
@Data
@Getter
@Setter
public class Store {

    @Id
    @Column(name = "STOR_CD", length = 12)
    private String storCd;

    @Column(name = "STOR_NM", length = 50)
    private String storNm;

    @Column(name = "ADDR", length = 100)
    private String addr;

    @Column(name = "TEL", length = 20)
    private String tel;

    @Column(name = "MAIN_PHOTO")
    private byte[] mainPhoto;

    @Column(name = "ETC")
    private String etc;


}
