package com.rihazzahir.lambokdemo.services;

import com.rihazzahir.lambokdemo.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
