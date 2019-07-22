package service;

import entity.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();
    Province findById(Long id);
    List<Province> findAllByName(String name);
}
