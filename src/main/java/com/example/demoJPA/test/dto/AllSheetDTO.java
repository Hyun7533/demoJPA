package com.example.demoJPA.test.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class AllSheetDTO {

    private Long id;

    private List<Sheet0DTO> sheet0;

    private List<Sheet1DTO> sheet1;

    private List<Sheet2DTO> sheet2;

    private Sheet3DTO sheet3;
}
