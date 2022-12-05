package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CoinsModel;
import com.example.demo.services.CoinsService;

@RestController
@RequestMapping("/api/v1/coins")
public class CoinsController {
    @Autowired
    CoinsService coinsService;

    @GetMapping()
    public ArrayList<CoinsModel> getCoins() {
        return coinsService.getCoins();
    }

    @PostMapping()
    public CoinsModel storeCoins(@RequestBody CoinsModel coins) {
        return this.coinsService.storeCoins(coins);
    }

    @GetMapping("/query")
    public ArrayList<CoinsModel> getCoinsByValue(@RequestParam("value") Integer value) {
        return this.coinsService.getCoinsByValue(value);
    }
}
