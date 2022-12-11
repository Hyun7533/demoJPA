package com.example.demoJPA.store;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, String> {

    List<Store> findByStorCd(String storeCd);

}
