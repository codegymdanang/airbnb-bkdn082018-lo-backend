package com.looo.service;

import com.codegym.entity.House;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
public interface HouseService {
    List<House> getAllHouse();
    void save(House house);
    void remove(Long id);
    Optional<House> findByid(Long id);
}
