package com.codegym.repository;


import com.codegym.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface DistrictRepository extends JpaRepository<District,Long> {
    List<District> findAllByProvince_Id(Long id);
    List<District> findAllByProvince_Name(String provinceName);
}
