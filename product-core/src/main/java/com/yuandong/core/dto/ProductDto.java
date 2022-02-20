package com.yuandong.core.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private String type;
    private String name;
    private String manager;
    private String department;
    private BigDecimal amount;
}
