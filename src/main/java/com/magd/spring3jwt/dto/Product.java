package com.magd.spring3jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private int productId;
    private String name;
    private int qty;
    private BigDecimal price;

}
