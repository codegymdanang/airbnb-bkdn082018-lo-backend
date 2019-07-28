package com.looo.service;

import com.codegym.entity.House;
import com.codegym.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class HouseServiceImpl implements  HouseService{
    @Autowired
    HouseRepository houseRepository;

    @Override
    public Page<House> getAllHouse(Pageable pageable) {
        return houseRepository.findAll(pageable);
    }

    @Override
    public void save(House house) {
        houseRepository.save(house);
    }

    @Override
    public void remove(Long id) {
        houseRepository.deleteById(id);
    }

    @Override
    public Optional<House> findByid(Long id) {
        return houseRepository.findById(id);
    }
}
