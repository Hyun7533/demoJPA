package com.example.demoJPA.invtReprtWait;

import com.example.demoJPA.invtReprtErr.InvtReprtErr;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class InvtReprtWaitCTL {

    private final InvtReprtWaitSVC invtReprtWaitSVC;


    @PostMapping("/saveInvtReprtWait")
    public Long saveInvtReprtWait(@RequestBody List<?> data) {

        return invtReprtWaitSVC.save(data);
    }
}
