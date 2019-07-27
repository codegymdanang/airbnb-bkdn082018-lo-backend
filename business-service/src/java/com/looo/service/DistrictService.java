package com.looo.service;

import com.codegym.entity.District;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DistrictService {
    List<District> findAll();

//    List<District> findAllById_Province(Long id);
//
//    List<District> findAllDistrictByName_Province(String name);
//
//    Optional<District> findById(Long id);
}
