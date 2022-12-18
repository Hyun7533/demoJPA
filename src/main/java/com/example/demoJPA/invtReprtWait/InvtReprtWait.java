package com.example.demoJPA.invtReprtWait;

import com.example.demoJPA.invtReprtList.InvtReprtList;
import com.example.demoJPA.invtReprtWaitErr.InvtReprtWaitErr;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "REITS_INVT_REPRT_WAIT")
public class InvtReprtWait {

    @Id @GeneratedValue
    @Column(name = "INVT_REPRT_WAIT_NO")
    private Long invtReprtWaitNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "INVT_REPRT_LIST_NO")
    private InvtReprtList invtReprtListNo;

    @OneToMany(mappedBy = "invtReprtWait")
    private List<InvtReprtWaitErr> invtReprtWaitErrs;

    private String jsonReprt;



}
