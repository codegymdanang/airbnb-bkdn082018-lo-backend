package com.looo.service;


import com.codegym.entity.Village;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VillageService {
    List<Village> findAll();
//
//    List<Village> findAllById_District(Long id);
//
//    List<Village> findAllByName_District(String name);
//
//    Optional<Village> findById(Long id);
}
