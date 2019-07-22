package service;

import entity.District;

import java.util.List;

public interface DistrictService {
    List<District> findAll();
    District findById(Long id);
    List<District> findAllByName(String name);
}
