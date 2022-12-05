package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CoinsModel;

@Repository
public interface CoinsRepository extends CrudRepository<CoinsModel, Long> {
    public abstract ArrayList<CoinsModel> findByValue(Integer value);
}
