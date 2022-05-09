package com.study.stackintelli.web.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BeginResponseDtoTest {

    @Test
    public void lombok_test(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        BeginResponseDto dto = new BeginResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
