package com.rihazzahir.lambokdemo.controllers;

import com.rihazzahir.lambokdemo.model.Beer;
import com.rihazzahir.lambokdemo.services.BeerService;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class BeerController {

    BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    public Beer getBeerById(UUID id){
        return beerService.getBeerById(id);
    }
}
