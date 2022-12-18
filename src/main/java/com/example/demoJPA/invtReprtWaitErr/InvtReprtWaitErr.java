package com.example.demoJPA.invtReprtWaitErr;

import com.example.demoJPA.invtReprtWait.InvtReprtWait;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "REITS_INVT_REPRT_WAIT_ERR")
public class InvtReprtWaitErr {

    @Id @GeneratedValue
    @Column(name = "INVT_REPRT_WAIT_ERR_NO")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "INVT_REPRT_WAIT_NO")
    private InvtReprtWait invtReprtWait;

    private String ctnt;

    private String knd;
}
