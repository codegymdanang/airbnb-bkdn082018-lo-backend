package service;

import entity.Village;

import java.util.List;

public interface VillageService {
    List<Village> findAll();
    Village findById(Long id);
    List<Village> findAllByName(String name);
}
