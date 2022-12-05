package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CoinsModel;
import com.example.demo.repositories.CoinsRepository;

@Service
public class CoinsService {
    @Autowired
    CoinsRepository coinsRepository;

    public ArrayList<CoinsModel> getCoins() {
        return (ArrayList<CoinsModel>) coinsRepository.findAll();
    }

    public CoinsModel storeCoins(CoinsModel coins) {
        return coinsRepository.save(coins);
    }

    public ArrayList<CoinsModel> getCoinsByValue(Integer value) {
        return coinsRepository.findByValue(value);
    }
}
