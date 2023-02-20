package com.rihazzahir.lambokdemo.services;

import com.rihazzahir.lambokdemo.model.Beer;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .uuid(id)
                .beerName("Bira White")
                .version(1)
                .price(BigDecimal.valueOf(300))
                .build();
    }
}
