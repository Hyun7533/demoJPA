package com.example.demoJPA.invtReprtList;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InvtReprtListCTL {

    private final InvtReprtListSVC invtReprtListSVC;


    @PostMapping("/saveInvtReprtList")
    public Long saveInvtReprtList(@RequestBody InvtReprtList invtReprtList) {
        return invtReprtListSVC.save(invtReprtList);
    }
}
