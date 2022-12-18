package com.example.demoJPA.invtReprtList;

import com.example.demoJPA.invtReprt.InvtReprt;
import com.example.demoJPA.invtReprtWait.InvtReprtWait;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "REITS_INVT_REPRT_LIST")
public class InvtReprtList {

    @Id @GeneratedValue
    @Column(name = "INVT_REPRT_LIST_NO")
    private Long id;

    @OneToMany(mappedBy = "invtReprtListNo")
    private List<InvtReprtWait> invtReprtWaits;

    private String knd;

}
