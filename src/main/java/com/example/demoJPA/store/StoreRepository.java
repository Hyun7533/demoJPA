package com.example.demoJPA.store;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, String> {

    List<Store> findAllByStorCd(String storeCd);

}
