package com.example.demoJPA.test.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
@NoArgsConstructor
public class Sheet0DTO {


    private String a0;

    private String b0;

    private String c0;

    private String d0;

    @Builder
    public Sheet0DTO(String a0, String b0, String c0, String d0) {
        this.a0 = a0;
        this.b0 = b0;
        this.c0 = c0;
        this.d0 = d0;
    }
}
