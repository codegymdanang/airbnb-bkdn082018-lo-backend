package com.looo.service;

import com.codegym.entity.District;
import com.codegym.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;
    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }
//
//    @Override
//    public List<District> findAllById_Province(Long id) {
//        if (id == null){
//            try {
//                throw new Error("Id is null");
//            } catch (Error e) {
//                e.printStackTrace();
//            }
//        }
//        return districtRepository.findAllByProvince_Id(id);
//    }
//
//    @Override
//    public List<District> findAllDistrictByName_Province(String name) {
//        return districtRepository.findAllByProvince_Name(name);
//    }
//
//    @Override
//    public Optional<District> findById(Long id) {
//        return districtRepository.findById(id);
//    }
}
