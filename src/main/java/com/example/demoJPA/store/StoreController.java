package com.example.demoJPA.store;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StoreController {

    private final StoreService storeService;

    @PostMapping("/findByStorCd")
    public List<Store> findByStorCd(@RequestBody Store store) {
        log.debug(store.getStorCd());
        return storeService.findByStorCd(store.getStorCd());
    }

    @PostMapping("/findAllStore")
    public List<Store> findAllStore() {
        return storeService.findAllStore();
    }


}
