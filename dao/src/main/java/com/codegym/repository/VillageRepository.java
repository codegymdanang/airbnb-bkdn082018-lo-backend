package com.codegym.repository;


import com.codegym.entity.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface VillageRepository extends JpaRepository<Village,Long> {
//    List<Village> findAllById_District(Long id);
//    List<Village> findAllByName_District(String name);
}
