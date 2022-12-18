package com.example.demoJPA.invtReprtList;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class InvtReprtListSVC {

    private final InvtReprtListREPO invtReprtListREPO;

    public Long save(InvtReprtList invtReprtList) {
        return invtReprtListREPO.save(invtReprtList);
    }
}
