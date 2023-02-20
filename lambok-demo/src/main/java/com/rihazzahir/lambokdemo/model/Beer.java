package com.rihazzahir.lambokdemo.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
public class Beer {

    private UUID uuid;
    private Integer version;
    private String beerName;
    private BigDecimal price;
}
