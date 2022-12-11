package com.example.demoJPA.store;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public List<Store> getStoreService(String storeCd) {
        return storeRepository.findAllByStorCd(storeCd);
    }

}
