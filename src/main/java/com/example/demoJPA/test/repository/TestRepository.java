package com.example.demoJPA.test.repository;

import com.example.demoJPA.test.dto.Sheet0DTO;
import com.example.demoJPA.test.dto.Sheet1DTO;
import com.example.demoJPA.test.dto.Sheet2DTO;
import com.example.demoJPA.test.dto.Sheet3DTO;
import com.example.demoJPA.test.entity.Sheet0Entity;
import com.example.demoJPA.test.entity.Sheet1Entity;
import com.example.demoJPA.test.entity.Sheet2Entity;
import com.example.demoJPA.test.entity.Sheet3Entity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TestRepository {

    @PersistenceContext
    private EntityManager em;


    public void saveSheet0(Sheet0DTO sheet0DTO) {
        Sheet0Entity sheet0Entity = Sheet0Entity.builder()
                .a0(sheet0DTO.getA0())
                .b0(sheet0DTO.getB0())
                .c0(sheet0DTO.getC0())
                .d0(sheet0DTO.getD0()).build();
        em.persist(sheet0Entity);
    }

    public void saveSheet1(Sheet1DTO sheet1DTO) {
        Sheet1Entity sheet1Entity = new Sheet1Entity();
        sheet1Entity.setA1(sheet1DTO.getA1());
        sheet1Entity.setB1(sheet1DTO.getB1());
        sheet1Entity.setC1(sheet1DTO.getC1());
        em.persist(sheet1Entity);
    }

    public void saveSheet2(Sheet2DTO sheet2DTO) {
        Sheet2Entity sheet2Entity = new Sheet2Entity();
        sheet2Entity.setA2(sheet2DTO.getA2());
        sheet2Entity.setB2(sheet2DTO.getB2());
        sheet2Entity.setC2(sheet2DTO.getC2());
        sheet2Entity.setD2(sheet2DTO.getD2());
        em.persist(sheet2Entity);
    }

    public void saveSheet3(Sheet3DTO sheet3DTO) {
        Sheet3Entity sheet3Entity = new Sheet3Entity();
        sheet3Entity.setA3(sheet3DTO.getA3());
        sheet3Entity.setB3(sheet3DTO.getB3());
        sheet3Entity.setC3(sheet3DTO.getC3());
        sheet3Entity.setD3(sheet3DTO.getD3());
        em.persist(sheet3Entity);
    }

}
