package com.looo.service;

import com.codegym.entity.Province;
import com.codegym.repository.ProvinceRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;
    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return null;
    }


}
