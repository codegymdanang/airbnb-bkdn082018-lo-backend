package service;

import entity.District;

import java.util.List;

public interface DistrictService {
    List<District> findAll();
    District findDistrictByProvince_id(Long id);
    List<District> findAllDistrictByProvince_name(String name);
}
