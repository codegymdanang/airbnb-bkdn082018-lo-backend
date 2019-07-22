package service;

import entity.Village;
import org.springframework.beans.factory.annotation.Autowired;
import repository.VillageRepository;
import service.VillageService;

import java.util.List;

public class VillageServiceImpl implements VillageService {
    @Autowired
    VillageRepository villageRepository;
    @Override
    public List<Village> findAll() {
        return villageRepository.findAll();
    }

    @Override
    public Village findById(Long id) {
        return villageRepository.findById(id).get();
    }

    @Override
    public List<Village> findAllByName(String name) {
        return villageRepository.findAllByName(name);
    }
}
