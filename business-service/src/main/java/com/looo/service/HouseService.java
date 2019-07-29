package com.looo.service;

import com.codegym.entity.House;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HouseService {
    List<House> getAllHouse();
    void save(House house);
    void remove(Long id);
    Optional<House> findByid(Long id);
}
