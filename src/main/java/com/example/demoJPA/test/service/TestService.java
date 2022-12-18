package com.example.demoJPA.test.service;

import com.example.demoJPA.test.dto.AllSheetDTO;
import com.example.demoJPA.test.entity.Sheet0Entity;
import com.example.demoJPA.test.entity.Sheet1Entity;
import com.example.demoJPA.test.entity.Sheet2Entity;
import com.example.demoJPA.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public void saveAllSheet(AllSheetDTO allSheetDTO) {

        for(int i = 0; i<allSheetDTO.getSheet0().size(); i++) {
            testRepository.saveSheet0(allSheetDTO.getSheet0().get(i));
        }

        for(int i =0; i<allSheetDTO.getSheet1().size(); i++) {
            testRepository.saveSheet1(allSheetDTO.getSheet1().get(i));
        }

        for(int i=0; i<allSheetDTO.getSheet2().size(); i++) {
            testRepository.saveSheet2(allSheetDTO.getSheet2().get(i));
        }

        testRepository.saveSheet3(allSheetDTO.getSheet3());


    }
}
