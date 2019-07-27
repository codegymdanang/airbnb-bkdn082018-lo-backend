package com.codegym.repository;


import com.codegym.entity.Province;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface ProvinceRepository extends JpaRepository<Province,Long> {
}
