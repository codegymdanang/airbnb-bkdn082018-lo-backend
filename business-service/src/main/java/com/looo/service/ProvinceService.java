package com.looo.service;

import com.codegym.entity.Province;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProvinceService {
    List<Province> findAll();

    Province findById(Long id);
}
