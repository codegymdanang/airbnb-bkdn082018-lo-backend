package service;

import entity.Village;
import org.springframework.beans.factory.annotation.Autowired;
import repository.VillageRepository;

import java.util.List;

public class VillageServiceImpl implements VillageService {

    @Autowired
    private VillageRepository villageRepository;
    @Override
    public List<Village> findAll() {
        return villageRepository.findAll();
    }
}
