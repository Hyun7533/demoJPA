package com.example.demoJPA.invtReprtWait;

import com.example.demoJPA.invtReprtErr.InvtReprtErr;
import com.example.demoJPA.invtReprtWaitErr.InvtReprtWaitErr;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class InvtReprtWaitREPO {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveWaitData(InvtReprtWait waitData) {
        entityManager.persist(waitData); // 임시 보고서 데이터 저장
    }

    public void saveErr(String ctnt, String knd) {
        InvtReprtWaitErr invtReprtWaitErr = new InvtReprtWaitErr();
        invtReprtWaitErr.setCtnt(ctnt);
        invtReprtWaitErr.setKnd(knd);
        entityManager.persist(invtReprtWaitErr);
    }
}
