package com.looo.service;

import com.codegym.entity.Village;
import com.codegym.repository.VillageRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VillageServiceImpl implements VillageService {

    @Autowired
    private VillageRepository villageRepository;
    @Override
    public List<Village> findAll() {
        return villageRepository.findAll();
    }

//    @Override
//    public List<Village> findAllById_District(Long id) {
//        return villageRepository.findAllById_District(id);
//    }
//
//    @Override
//    public List<Village> findAllByName_District(String name) {
//        return villageRepository.findAllByName_District(name);
//    }
//
//    @Override
//    public Optional<Village> findById(Long id) {
//        return villageRepository.findById(id);
//    }
}
