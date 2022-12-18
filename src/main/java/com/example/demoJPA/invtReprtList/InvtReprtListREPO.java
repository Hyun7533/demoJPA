package com.example.demoJPA.invtReprtList;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class InvtReprtListREPO {

    @PersistenceContext
    private EntityManager entityManager;

    public Long save(InvtReprtList invtReprtList) {
        entityManager.persist(invtReprtList);
        return invtReprtList.getId();
    }
}
