package com.study.stackintelli.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BeginResponseDto {
    private final String name;
    private final int amount;
}
