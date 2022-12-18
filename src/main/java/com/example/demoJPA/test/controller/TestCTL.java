package com.example.demoJPA.test.controller;

import com.example.demoJPA.test.dto.AllSheetDTO;
import com.example.demoJPA.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestCTL {

    private final TestService testService;

    @PostMapping("/test")
    public void test(@RequestBody AllSheetDTO allSheetDTO) {

        testService.saveAllSheet(allSheetDTO);


    }

}
